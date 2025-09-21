package creator;

import entity.Ship;
import entity.Transport;

public class ShipCreator extends TransportCreator {

    @Override
    protected Transport createTransport() {
        return new Ship(300, "Ivan Nahodny");
    }
}
