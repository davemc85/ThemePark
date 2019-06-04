package stalls;

public class CandyFlossStall extends Stall {

    private CandyFlossStall candyFlossStall;

    public CandyFlossStall(String name, String ownerName, int parkingSpot) {
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
