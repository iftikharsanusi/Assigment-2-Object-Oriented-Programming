// Additional Class 3: ServiceRecord
public class ServiceRecord {

    // Private attributes
    private String recordId;
    private String mechanicName;
    private double serviceCost;

    // Parameterized Constructor
    public ServiceRecord(String recordId, String mechanicName, double serviceCost) {
        this.recordId = recordId;
        this.mechanicName = mechanicName;
        this.serviceCost = serviceCost;
    }

    // Getters and Setters
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    // Method to display service log
    public void displayServiceLog() {
        System.out.println("\n--- WORKSHOP SERVICE RECORD ---");
        System.out.println("Record ID     : " + recordId);
        System.out.println("Mechanic Name : " + mechanicName);
        System.out.println("Service Fee   : RM " + serviceCost);
        System.out.println("-------------------------------");
    }
}