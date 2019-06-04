package attractions;

public class Park extends Attraction implements IReviewed{

    private Park park;

    public Park(String name, int rating) {
        super(name, rating);
    }

    public String getName(){
        return name;
    }

    public int getRating(){
        return rating;
    }


}
