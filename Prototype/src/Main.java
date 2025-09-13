import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Order original = new Order(
                UUID.randomUUID(),
                "John Doe",
                Arrays.asList("Item1", "Item2"),
                LocalDate.now(),
                "Credit card",
                0.0
        );

        Order clone = original.deepCopy();
        clone.getItemList().add("Item3");
        clone.setDeliveryDate(LocalDate.now().plusMonths(1));

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}