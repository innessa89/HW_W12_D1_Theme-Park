import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;
    Attraction attraction;

    @Before
    public void before(){
        ArrayList<Attraction> attractions =new ArrayList<>();
        ArrayList<Stall> stalls=new ArrayList<>();
        themePark=new ThemePark(attractions,stalls);
        visitor = new Visitor(14, 1.2, 40.0);
        attraction=new RollerCoaster("Name",2);
    }

    @Test
    public void hasVisited(){
        themePark.


    }

}
