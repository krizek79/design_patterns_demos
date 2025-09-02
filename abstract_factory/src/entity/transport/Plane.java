package entity.transport;

public class Plane implements Transport {

    private final String uuid;
    private final int maxWeight;
    private final String flightNumber;

    public Plane(String uuid, int maxWeight, String flightNumber) {
        this.uuid = uuid;
        this.maxWeight = maxWeight;
        this.flightNumber = flightNumber;
    }

    @Override
    public void deliver(String destination) {
        System.out.println("UUID: " + this.uuid);
        System.out.println("Flight number: " + this.flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Max. weight: " + this.maxWeight);
    }

    @Override
    public String getUUID() {
        return this.uuid;
    }
}
