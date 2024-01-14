import java.util.List;
import java.util.Optional;

// Main Class - Entire Process
public class Main {
    public static void main(String[] args) {
        try {
            // Reading driver data from a file.
            List<Driver> drivers = DriverReader.readDrivers("src/drivers.txt");

            // Creating an instance of InputHandler to handle user input.
            InputHandler inputHandler = new InputHandler();

            // Capturing customer details from user input.
            Customer customer = inputHandler.captureCustomerDetails();

            // Capturing restaurant details from user input.
            Restaurant restaurant = inputHandler.captureRestaurantDetails();

            // Finding the nearest driver based on restaurant location.
            Optional<Driver> driver = DriverFinder.findNearestDriver(drivers, restaurant.getLocation());

            // Checking if a suitable driver was found.
            if (driver.isPresent()) {
                // Printing the found driver's details.
                System.out.println("Driver Found:");
                System.out.println("Name: " + driver.get().getName());
                System.out.println("Location: " + driver.get().getLocation());
                System.out.println("Load: " + driver.get().getLoad());

                // Generating the invoice using the gathered details.
                InvoiceGenerator.generateInvoice(customer, restaurant, driver.get());
                System.out.println("Invoice generated successfully.");
            } else {
                // Informing the user if no suitable driver was found.
                System.out.println("Sorry, no driver close enough...Please wait try again in a few minutes");
            }
        } catch (Exception e) {
            // Printing the stack trace in case of an exception.
            e.printStackTrace();
        }
    }
}
