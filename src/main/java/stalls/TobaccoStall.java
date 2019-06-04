package stalls;

public class TobaccoStall extends Stall {

    private TobaccoStall tobaccoStall;

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
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
}
