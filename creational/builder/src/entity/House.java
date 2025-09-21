package entity;

public class House {

    private final String walls;
    private final String roof;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;

    public House(String walls, String roof, boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden) {
        this.walls = walls;
        this.roof = roof;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
