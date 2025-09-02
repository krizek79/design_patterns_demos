package factory;

import entity.transport.Transport;
import entity.transport_person.TransportPerson;

public interface TransportFactory {

    Transport createTransport();

    TransportPerson createTransportPerson();
}
