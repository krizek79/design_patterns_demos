import creator.PlaneCreator;
import creator.ShipCreator;
import creator.TransportCreator;
import creator.TruckCreator;

public class Main {

    public static void main(String[] args) {
        TransportCreator truckCreator = new TruckCreator();
        truckCreator.planDelivery("Berlin");

        System.out.println("---------------------------------------");

        TransportCreator planeCreator = new PlaneCreator();
        planeCreator.planDelivery("Dhaka");

        System.out.println("---------------------------------------");

        TransportCreator shipCreator = new ShipCreator();
        shipCreator.planDelivery("Shanghai");
    }
}