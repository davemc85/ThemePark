package attractions;

import interfaces.IReviewed;
import interfaces.ISecurity;
import interfaces.ITicketed;
import people.Visitor;

public class Rollercoaster extends Attraction implements IReviewed, ITicketed, ISecurity {

    private int minHeight;
    private double price;

    public Rollercoaster(String name, int rating, int minHeight, double price ) {
        super(name, rating);
        this.minHeight = minHeight;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getRating(){
        return rating;
    }

    public int getMinHeight(){
        return minHeight;
    }


    public double defaultPrice() {
        return price;
    }


    //half price for kids
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.price / 2;
        } else {
            return this.price;

        }
    }

    // only allowed if over 12 and over 4 feet
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 120) {
            return true;
        } else {
            return false;
        }
    }
}
