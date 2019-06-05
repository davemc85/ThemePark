package stalls;

public abstract class Stall {

    protected String name;
    protected String ownerName;
    protected int parkingSpot;
    protected int rating;

    public Stall(String name, String ownerName, int parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

}
