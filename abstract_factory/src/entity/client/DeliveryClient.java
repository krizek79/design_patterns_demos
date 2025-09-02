package entity.client;

import factory.TransportFactory;
import entity.transport.Transport;
import entity.transport_person.TransportPerson;

public class DeliveryClient {

    private final Transport transport;

    private final TransportPerson transportPerson;

    public DeliveryClient(TransportFactory transportFactory) {
        this.transport = transportFactory.createTransport();
        this.transportPerson = transportFactory.createTransportPerson();
    }

    public void deliverPackage(String destination) {
        transportPerson.operateTransport(transport);
        transport.deliver(destination);
    }
}
