package attractions;

import interfaces.IReviewed;
import interfaces.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    private double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getRating(){
        return rating;
    }


    public double defaultPrice() {
        return price;
    }

    // half price for kids
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.price / 2;
        } else {
            return this.price;
        }
    }


}


