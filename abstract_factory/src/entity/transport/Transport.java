package entity.transport;

public interface Transport {

    void deliver(String destination);

    String getUUID();
}
