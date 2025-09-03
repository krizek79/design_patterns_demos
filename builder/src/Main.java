import builder.EcoHouseBuilder;
import builder.ModernHouseBuilder;
import director.ConstructionEngineer;
import entity.House;

public class Main {

    public static void main(String[] args) {
        ConstructionEngineer modernEngineer = new ConstructionEngineer(new ModernHouseBuilder());
        House modernHouse = modernEngineer.constructHouse();
        System.out.println("Modern house: " + modernHouse);

        ConstructionEngineer ecoEngineer = new ConstructionEngineer(new EcoHouseBuilder());
        House ecoHouse = ecoEngineer.constructHouse();
        System.out.println("Eco house: " + ecoHouse);
    }
}