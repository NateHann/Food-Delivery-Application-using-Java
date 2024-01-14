import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Class - Read driver data from file.
public class DriverReader {

    /**
     * Reads driver information from a specified file and creates a list of drivers.
     *
     * @param filename The name of the file to read from.
     * @return A list of Driver objects.
     * @throws IOException If an I/O error occurs.
     */
    public static List<Driver> readDrivers(String filename) throws IOException {
        // Initialize an empty list to store driver objects.
        List<Driver> drivers = new ArrayList<>();

        // Using try-with-resources to automatically close the BufferedReader.
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Read each line from the file until the end is reached.
            while ((line = reader.readLine()) != null) {
                // Split the line into parts - name, location, and load.
                String[] parts = line.split(",");
                String name = parts[0].trim();
                String location = parts[1].trim();
                int load = Integer.parseInt(parts[2].trim());

                // Create a new driver object and add it to the list.
                drivers.add(new Driver(name, location, load));
            }
        }

        // Return the list of drivers.
        return drivers;
    }
}
