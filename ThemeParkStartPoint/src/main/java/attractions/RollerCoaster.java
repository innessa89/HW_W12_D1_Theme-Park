package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity {

    private final static double PRICE=8.40d;
    private final static double MIN_TALL=145d;
    private final static int MIN_AGE=12;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return PRICE;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight()>=200){
            return PRICE*2;
        }else{
            return PRICE;
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight()>=MIN_TALL && visitor.getAge()>=MIN_AGE;
    }
}
