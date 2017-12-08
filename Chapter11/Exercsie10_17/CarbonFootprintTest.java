import java.util.ArrayList;

public class CarbonFootprintTest {

    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonSources = new ArrayList<>();
        carbonSources.add(new Building("NYC", 80, "propane", 100, 65));
        carbonSources.add(new Car("RR Phantom", "JV M 008", 1340, 10));
        carbonSources.add(new Bicycle("Mountain", "Blue", 500, 100));

        for (CarbonFootprint source : carbonSources) {
            System.out.println(source + "\nCarbon Footprint: " + source.getCarbonFootprint() + "\n");
        }
    }
}
