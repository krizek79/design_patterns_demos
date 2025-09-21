package factory;

import entity.transport.Ship;
import entity.transport.Transport;
import entity.transport_person.Captain;
import entity.transport_person.TransportPerson;

import java.util.UUID;

public class ShipFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new Ship(UUID.randomUUID().toString(), 600);
    }

    @Override
    public TransportPerson createTransportPerson() {
        return new Captain("Larry");
    }
}
