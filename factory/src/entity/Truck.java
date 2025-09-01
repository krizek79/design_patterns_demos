package entity;

public class Truck implements Transport {

    private final int maxLoad;
    private final String driverName;

    public Truck(int maxLoad, String driverName) {
        this.maxLoad = maxLoad;
        this.driverName = driverName;
    }

    @Override
    public void deliver(String destination) {
        System.out.println("Truck driver: " + this.driverName);
        System.out.println("Destination: " + destination);
        System.out.println("Max. load: " + this.maxLoad);
    }
}
