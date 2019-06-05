package stalls;

import interfaces.IReviewed;

public class IceCreamStall extends Stall implements IReviewed {

    private IceCreamStall iceCreamStall;

    public IceCreamStall(String name, String ownerName, int parkingSpot, int rating) {
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
}
