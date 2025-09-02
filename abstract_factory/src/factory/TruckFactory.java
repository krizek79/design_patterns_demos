package factory;

import entity.transport.Transport;
import entity.transport.Truck;
import entity.transport_person.Driver;
import entity.transport_person.TransportPerson;

import java.util.UUID;

public class TruckFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new Truck(UUID.randomUUID().toString(), 4500);
    }

    @Override
    public TransportPerson createTransportPerson() {
        return new Driver("Garry");
    }
}
