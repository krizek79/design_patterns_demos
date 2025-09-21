package builder;

import entity.House;

public class EcoHouseBuilder implements HouseBuilder {

    private String walls;
    private String roof;
    private boolean garage;
    private boolean swimmingPool;
    private boolean garden;

    @Override
    public void buildWalls() {
        this.walls = "Wooden eco walls";
    }

    @Override
    public void buildRoof() {
        this.roof = "Green eco roof";
    }

    @Override
    public void buildGarage() {
        this.garage = false;
    }

    @Override
    public void buildSwimmingPool() {
        this.swimmingPool = false;
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
