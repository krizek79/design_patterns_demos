package creator;

import entity.Transport;
import entity.Truck;

public class TruckCreator extends TransportCreator {

    @Override
    protected Transport createTransport() {
        return new Truck(500, "Juraj Nahodny");
    }
}
