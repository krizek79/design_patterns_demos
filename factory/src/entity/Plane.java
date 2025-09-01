package entity;

public class Plane implements Transport {

    private final int maxWeight;
    private final String flightNumber;

    public Plane(int maxWeight, String flightNumber) {
        this.maxWeight = maxWeight;
        this.flightNumber = flightNumber;
    }

    @Override
    public void deliver(String destination) {
        System.out.println("Flight number: " + this.flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Max. weight: " + this.maxWeight);
    }
}
