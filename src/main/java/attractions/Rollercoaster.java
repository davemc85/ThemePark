package attractions;

public class Rollercoaster extends Attraction implements IReviewed {

    private Rollercoaster rollercoaster;

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    public String getName(){
        return name;
    }

    public int getRating(){
        return rating;
    }
}
