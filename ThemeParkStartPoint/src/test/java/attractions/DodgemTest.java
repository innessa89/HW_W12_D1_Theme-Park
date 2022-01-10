package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;


    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1=new Visitor(10,210d, 100d);
        visitor2=new Visitor(20,180d, 100d);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGetHalfPrice(){
        double price = dodgems.priceFor(visitor1);
        assertEquals(2.25d, price,0.0);
    }

    @Test
    public void canGetFullPrice(){
        double price = dodgems.priceFor(visitor2);
        assertEquals(4.50d, price,0.0);
    }


}
