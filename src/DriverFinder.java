import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Class - Finding the nearest available driver.
public class DriverFinder {

    /**
     * Finds the nearest driver to a given location with the smallest load.
     *
     * @param drivers  A list of all available drivers.
     * @param location The location to match with the driver's location.
     * @return An Optional containing the nearest driver, if found; otherwise, an empty Optional.
     */
    public static Optional<Driver> findNearestDriver(List<Driver> drivers, String location) {
        // Uses a stream to process the list of drivers.
        return drivers.stream()
                // Filters drivers based on the provided location (ignores case differences).
                .filter(driver -> driver.getLocation().equalsIgnoreCase(location))
                // Finds the driver with the minimum load (least busy).
                // Comparator.comparingInt is used to compare drivers based on their load.
                .min(Comparator.comparingInt(Driver::getLoad));
    }
}

// I initially used a regular for-loop with conditions to find the driver, but I asked a friend / did research on if this would be the most concise way.
// I decided java.util.optional using a stream.We take list of drivers and convert into stream. This work like a conveyor , bringing data forward,much like iterating.
// Filter method - picking out drivers that match our requested location – pulling all the matched locations.
// Min method. Chose minimum load from pulled drivers
// This makes the code  shorter, concise and is cleaner code.
