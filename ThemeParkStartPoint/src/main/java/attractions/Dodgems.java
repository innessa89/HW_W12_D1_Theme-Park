package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private final static double PRICE = 4.50d;
    private final static int MIN_AGE=12;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return PRICE;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge()<MIN_AGE){
            return PRICE/2;
        }else{
            return PRICE;
        }
    }
}
