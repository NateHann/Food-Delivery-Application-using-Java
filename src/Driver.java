// Driver - Class
public class Driver {
    // Attributes - Driver class
    private String name;
    private String location;
    private int load;

    // Constructor to initialize the Driver object.
    public Driver(String name, String location, int load) {
        this.name = name;
        this.location = location;
        this.load = load;
    }

    // Returns the name of the driver.
    public String getName() {
        return name;
    }

    // Sets the name of the driver.
    public void setName(String name) {
        this.name = name;
    }

    // Returns the location of the driver.
    public String getLocation() {
        return location;
    }

    // Sets the location of the driver.
    public void setLocation(String location) {
        this.location = location;
    }

    // Returns the load (workload) of the driver.
    public int getLoad() {
        return load;
    }

    // Sets the load (workload) of the driver.
    public void setLoad(int load) {
        this.load = load;
    }
}
