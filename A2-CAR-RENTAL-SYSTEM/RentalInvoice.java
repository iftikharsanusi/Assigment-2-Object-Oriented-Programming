// Additional Class 2: RentalInvoice
public class RentalInvoice {

    // Private attributes
    private String invoiceId;
    private double totalAmount;

    // Parameterized Constructor
    public RentalInvoice(String invoiceId, double totalAmount) {
        this.invoiceId = invoiceId;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Method to print simple receipt
    public void printReceipt(String customerName, String carName, int days) {
        System.out.println("\n========= RENTAL RECEIPT =========");
        System.out.println("Invoice ID    : " + invoiceId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Rented Car    : " + carName);
        System.out.println("Total Days    : " + days + " day(s)");
        System.out.println("Total Price   : RM " + totalAmount);
        System.out.println("==================================");
    }
}