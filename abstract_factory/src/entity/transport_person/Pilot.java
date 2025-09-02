package entity.transport_person;

import entity.transport.Transport;

public class Pilot implements TransportPerson {

    private final String name;

    public Pilot(String name) {
        this.name = name;
    }

    @Override
    public void operateTransport(Transport transport) {
        System.out.println(this.getClass().getSimpleName() + " " + this.name + " operating transport: " + transport.getClass().getSimpleName() + " (" + transport.getUUID() + ")");
    }
}
