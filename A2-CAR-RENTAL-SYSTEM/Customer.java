// Additional Class 1: Customer
public class Customer {

    // Private attributes
    private String customerId;
    private String name;
    private String phoneNumber;

    // Parameterized Constructor
    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to display customer info
    public void displayCustomerInfo() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + name);
        System.out.println("Phone Number  : " + phoneNumber);
    }
}