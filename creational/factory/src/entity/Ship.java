package entity;

public class Ship implements Transport {

    private final int capacity;
    private final String captainName;

    public Ship(int capacity, String captainName) {
        this.capacity = capacity;
        this.captainName = captainName;
    }

    @Override
    public void deliver(String destination) {
        System.out.println("Captain name: " + this.captainName);
        System.out.println("Destination: " + destination);
        System.out.println("Capacity: " + this.capacity);

    }
}
