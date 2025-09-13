import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order implements CloneableEntity<Order> {

    private UUID uuid;

    private String customerName;

    private List<String> itemList;

    private LocalDate deliveryDate;

    private String paymentMethod;

    private double discount;

    public Order(
            UUID uuid,
            String customerName,
            List<String> itemList,
            LocalDate deliveryDate,
            String paymentMethod,
            double discount
    ) {
        this.uuid = uuid;
        this.customerName = customerName;
        this.itemList = itemList;
        this.deliveryDate = deliveryDate;
        this.paymentMethod = paymentMethod;
        this.discount = discount;
    }

    @Override
    public Order deepCopy() {
        List<String> clonedItems = new ArrayList<>(this.itemList);

        return new Order(
                UUID.randomUUID(),
                this.customerName,
                clonedItems,
                this.deliveryDate,
                this.paymentMethod,
                this.discount
        );
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + this.uuid +
                ", customerName='" + this.customerName + '\'' +
                ", itemList=" + this.itemList +
                ", deliveryDate=" + this.deliveryDate +
                ", paymentMethod='" + this.paymentMethod + '\'' +
                ", discount=" + this.discount +
                '}';
    }
}
