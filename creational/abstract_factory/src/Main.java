import entity.client.DeliveryClient;
import factory.PlaneFactory;
import factory.ShipFactory;
import factory.TransportFactory;
import factory.TruckFactory;

public class Main {

    public static void main(String[] args) {
        TransportFactory truckFactory = new TruckFactory();
        TransportFactory planeFactory = new PlaneFactory();
        TransportFactory shipFactory = new ShipFactory();

        DeliveryClient deliveryClient1 = new DeliveryClient(truckFactory);
        deliveryClient1.deliverPackage("Berlin");

        System.out.println("---------------------------------------");

        DeliveryClient deliveryClient2 = new DeliveryClient(planeFactory);
        deliveryClient2.deliverPackage("London");

        System.out.println("---------------------------------------");

        DeliveryClient deliveryClient3 = new DeliveryClient(shipFactory);
        deliveryClient3.deliverPackage("Oslo");
    }
}
