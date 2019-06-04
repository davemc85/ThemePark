package attractions;

import interfaces.IReviewed;
import people.Visitor;

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

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 14) {
            return true;
        } else {
            return false;
        }
    }



}
