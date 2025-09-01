package creator;

import entity.Plane;
import entity.Transport;

import java.util.UUID;

public class PlaneCreator extends TransportCreator {

    @Override
    protected Transport createTransport() {
        return new Plane(200, UUID.randomUUID().toString());
    }
}
