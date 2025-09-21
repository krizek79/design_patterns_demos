package entity.transport;

public class Truck implements Transport {

    private final String uuid;
    private final int maxLoad;

    public Truck(String uuid, int maxLoad) {
        this.uuid = uuid;
        this.maxLoad = maxLoad;
    }

    @Override
    public void deliver(String destination) {
        System.out.println("UUID: " + this.uuid);
        System.out.println("Destination: " + destination);
        System.out.println("Max. load: " + this.maxLoad);
    }

    @Override
    public String getUUID() {
        return this.uuid;
    }
}
