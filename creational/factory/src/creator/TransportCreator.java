package creator;

import entity.Transport;

public abstract class TransportCreator {

    protected abstract Transport createTransport();

    public void planDelivery(String destination) {
        Transport transport = createTransport();
        transport.deliver(destination);
    }
}
