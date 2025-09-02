package factory;

import entity.transport.Plane;
import entity.transport.Transport;
import entity.transport_person.Pilot;
import entity.transport_person.TransportPerson;

import java.util.UUID;

public class PlaneFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new Plane(UUID.randomUUID().toString(), 700, UUID.randomUUID().toString());
    }

    @Override
    public TransportPerson createTransportPerson() {
        return new Pilot("Tom");
    }
}
