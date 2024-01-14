// Restaurant Class
public class Restaurant {
    // Attributes to store the restaurant's details
    private String name;
    private String location;
    private String contactNumber;

    // Constructor to initialize the restaurant object.
    public Restaurant(String name, String location, String contactNumber) {
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    // Returns the name of the restaurant.
    public String getName() {
        return name;
    }

    // Sets the name of the restaurant.
    public void setName(String name) {
        this.name = name;
    }

    // Returns the location of the restaurant.
    public String getLocation() {
        return location;
    }

    // Sets the location of the restaurant.
    public void setLocation(String location) {
        this.location = location;
    }

    // Returns the contact number of the restaurant.
    public String getContactNumber() {
        return contactNumber;
    }

    // Sets the contact number of the restaurant.
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
