import java.util.HashMap;
import java.util.Map;

// Customer - Class
public class Customer {
    // Attributes - Customer class
    private String orderNumber;
    private String customerName;
    private String contactNumber;
    private String address;
    private String city;
    private String email;
    private String restaurantName;
    private Map<String, Integer> order; // Stores order items and their quantities
    private String specialInstructions;
    private double totalAmount;

    // Constructor for Customer, initializes order Map.
    public Customer() {
        this.order = new HashMap<>();
    }

    // Getters and setters for the class attributes
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Map<String, Integer> getOrder() {
        return order;
    }

    public void setOrder(Map<String, Integer> order) {
        this.order = order;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Adds an item and its quantity to the customer's order
    public void addItemToOrder(String itemName, int quantity) {
        this.order.put(itemName, quantity);
    }

    // Removes an item from the customer's order
    public void removeItemFromOrder(String itemName) {
        this.order.remove(itemName);
    }
}
