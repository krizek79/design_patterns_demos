package entity.transport;

public class Ship implements Transport {

    private final String uuid;
    private final int capacity;

    public Ship(String uuid, int capacity) {
        this.uuid = uuid;
        this.capacity = capacity;
    }

    @Override
    public void deliver(String destination) {
        System.out.println("UUID: " + this.uuid);
        System.out.println("Destination: " + destination);
        System.out.println("Capacity: " + this.capacity);
    }

    @Override
    public String getUUID() {
        return this.uuid;
    }
}