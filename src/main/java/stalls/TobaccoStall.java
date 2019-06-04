package stalls;

import interfaces.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private TobaccoStall tobaccoStall;

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public String getName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public int getParkingSpot(){
        return parkingSpot;
    }

    public int getRating(){
        return rating;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 18){
            return true;
        } else {
            return false;
        }
    }

}
