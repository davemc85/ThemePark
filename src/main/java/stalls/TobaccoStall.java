package stalls;

public class TobaccoStall extends Stall {

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
}
