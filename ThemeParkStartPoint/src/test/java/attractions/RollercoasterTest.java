package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1=new Visitor(20,210d, 100d);
        visitor2=new Visitor(20,180d, 100d);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canGetDoubledPrice(){
        double price = rollerCoaster.priceFor(visitor1);
        assertEquals(16.8d, price,0.0);
    }

    @Test
    public void canGetStandardPrice(){
        double price = rollerCoaster.priceFor(visitor2);
        assertEquals(8.40d, price,0.0);
    }





}
