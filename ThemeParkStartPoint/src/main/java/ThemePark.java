import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.Collections;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> results = new ArrayList<>();
        results.addAll(attractions);
        results.addAll(stalls);
        return results;
    }

    public void visit(Visitor visitor,Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addAttraction(attraction);;
    }
}
