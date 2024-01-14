import java.util.Scanner;

// Input Handler Class - Handles customer and restaurant details input.
public class InputHandler {
    private Scanner scanner;

    // Constructor to initialize the scanner for user input.
    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    // Captures customer details from user input and returns a Customer object.
    public Customer captureCustomerDetails() {
        Customer customer = new Customer();

        System.out.println("Please enter requested details");
        customer.setOrderNumber(promptForInput("Order Number: "));
        customer.setCustomerName(promptForInput("Customer Name: "));
        customer.setContactNumber(promptForInput("Contact Number: "));
        customer.setAddress(promptForInput("Address: "));
        customer.setCity(promptForInput("City: "));
        customer.setEmail(promptForInput("Email: "));
        customer.setRestaurantName(promptForInput("Restaurant Name: "));

        // Capturing order details in a loop
        boolean moreItems = true;
        while (moreItems) {
            String itemName = promptForInput("Enter item name: ");
            int quantity = promptForInteger("Enter quantity: ");
            customer.addItemToOrder(itemName, quantity);

            moreItems = promptForInput("Do you want to add more items? (yes/no): ").equalsIgnoreCase("yes");
        }

        customer.setSpecialInstructions(promptForInput("Special Instructions: "));
        customer.setTotalAmount(promptForDouble("Total Amount: "));

        return customer;
    }

    // Captures restaurant details from user input and returns a Restaurant object.
    public Restaurant captureRestaurantDetails() {
        System.out.println("Enter Restaurant Details:");

        String name = promptForInput("Restaurant Name: ");
        String location = promptForInput("Location: ");
        String contactNumber = promptForInput("Contact Number: ");

        return new Restaurant(name, location, contactNumber);
    }

    // Method to prompt for a String input
    private String promptForInput(String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (!input.trim().isEmpty()) {
                return input;
            }
            System.out.println("Input not recognised, please re-enter.");
        }
    }

    // Method to prompt for an integer input
    private int promptForInteger(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(promptForInput(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again.");
            }
        }
    }

    // Method to prompt for a double input
    private double promptForDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(promptForInput(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount, please try again.");
            }
        }
    }
}
