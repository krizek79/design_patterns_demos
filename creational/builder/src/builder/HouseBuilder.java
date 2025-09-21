package builder;

import entity.House;

public interface HouseBuilder {

    void buildWalls();

    void buildRoof();

    void buildGarage();

    void buildSwimmingPool();

    void buildGarden();

    House getResult();
}
