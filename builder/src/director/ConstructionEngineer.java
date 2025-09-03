package director;

import builder.HouseBuilder;
import entity.House;

public class ConstructionEngineer {

    private final HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildGarage();
        houseBuilder.buildSwimmingPool();
        houseBuilder.buildGarden();

        return houseBuilder.getResult();
    }
}
