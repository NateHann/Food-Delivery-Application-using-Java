import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

// Invoice Generator Class
public class InvoiceGenerator {

    // Generates an invoice and writes to invoice.txt
    public static void generateInvoice(Customer customer, Restaurant restaurant, Driver driver) throws IOException {
        // Build the invoice as a String
        String invoiceContent = buildInvoiceContent(customer, restaurant, driver);

        // Using BufferedWriter to write the content to 'invoice.txt'
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("invoice.txt"))) {
            writer.write(invoiceContent);
        }
    }

    private static String buildInvoiceContent(Customer customer, Restaurant restaurant, Driver driver) {
        StringBuilder sb = new StringBuilder();

        // Company Header
        sb.append("ChowNow - Food Delivery Service\n");
        sb.append("======================\n");

        // Invoice Header
        sb.append("INVOICE\n");
        sb.append("======================\n");

        // Customer and Order Information
        sb.append("Order Number: ").append(customer.getOrderNumber()).append("\n");
        sb.append("Customer Name: ").append(customer.getCustomerName()).append("\n");
        sb.append("Contact Number: ").append(customer.getContactNumber()).append("\n");
        sb.append("Email: ").append(customer.getEmail()).append("\n");
        sb.append("Delivery Address: ").append(customer.getAddress()).append(", ").append(customer.getCity()).append("\n\n");

        // Restaurant Information
        sb.append("Restaurant: ").append(restaurant.getName()).append("\n");
        sb.append("Restaurant Location: ").append(restaurant.getLocation()).append("\n");
        sb.append("Restaurant Contact: ").append(restaurant.getContactNumber()).append("\n\n");

        // Order Details
        sb.append("Order Details:\n");
        for (Map.Entry<String, Integer> entry : customer.getOrder().entrySet()) {
            sb.append(entry.getValue()).append(" x ").append(entry.getKey()).append("\n");
        }

        // Special Instructions
        sb.append("Special Instructions: ").append(customer.getSpecialInstructions()).append("\n");

        // Total Amount
        sb.append("Total Amount Due: ZAR ").append(customer.getTotalAmount()).append("\n\n");

        // Driver Information
        sb.append("Your Order Will Be Delivered By: ").append(driver.getName()).append(", Located at: ").append(driver.getLocation()).append(". He/She is located closest to your route currently.\n\n");

        // Thank You Note
        sb.append("Thank you for choosing our service! We hope you enjoy your meal.\n");
        sb.append("=======================\n");
        // Restaurant Contact Reminder
        sb.append("For any inquiries, contact ").append(restaurant.getName()).append(" at ").append(restaurant.getContactNumber()).append(" or alternatively contact ChowNow on 041-123-1111\n");
        sb.append("=======================\n");
        // Returning the complete invoice content
        return sb.toString();
    }
}