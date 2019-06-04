package attractions;

import interfaces.IReviewed;

public class Playground extends Attraction implements IReviewed {

    private Playground playgrouund;

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public String getName(){
        return name;
    }

    public int getRating(){
        return rating;
    }



}
