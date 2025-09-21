package builder;

import entity.House;

public class ModernHouseBuilder implements HouseBuilder {

    private String walls;
    private String roof;
    private boolean garage;
    private boolean swimmingPool;
    private boolean garden;

    @Override
    public void buildWalls() {
        this.walls = "Brick and glass walls";
    }

    @Override
    public void buildRoof() {
        this.roof = "Concrete flat roof";
    }

    @Override
    public void buildGarage() {
        this.garage = true;
    }

    @Override
    public void buildSwimmingPool() {
        this.swimmingPool = true;
    }

    @Override
    public void buildGarden() {
        this.garden = true;
    }

    @Override
    public House getResult() {
        return new House(walls, roof, garage, swimmingPool, garden);
    }
}
