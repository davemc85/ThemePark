package attractions;

public class Dodgems extends Attraction implements IReviewed{

    private Dodgems dodgems;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public String getName(){
        return name;
    }

    public int getRating(){
        return rating;
    }

}


