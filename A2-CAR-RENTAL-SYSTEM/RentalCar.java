// Base Class (Superclass) implementing Rentable interface
public class RentalCar{

    // Private attributes (Encapsulation)
    private String carId;
    private String brand;
    private String model;
    private String plateNumber;
    private double dailyRate;
    private int mileage;
    private boolean isAvailable;

    // Default Constructor
    public RentalCar() {
        this.carId = "C001";
        this.brand = "Lamborghini";
        this.model = "Axia";
        this.plateNumber = "MLK 0404";
        this.dailyRate = 100.00;
        this.mileage = 10000;
        this.isAvailable = true;
    }

    // Parameterized Constructor
    public RentalCar(String carId, String brand, String model, String plateNumber,
                     double dailyRate, int mileage, boolean isAvailable) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.dailyRate = dailyRate;
        this.mileage = mileage;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        if (dailyRate > 0) {
            this.dailyRate = dailyRate;
        } else {
            System.out.println("Invalid rate! Rate must be more than RM 0.");
        }
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method 1: Display car details
    public void displayCarInfo() {
        System.out.println("----------------------------------");
        System.out.println("Car ID        : " + carId);
        System.out.println("Brand & Model : " + brand + " " + model);
        System.out.println("Plate Number  : " + plateNumber);
        System.out.println("Daily Rate    : RM " + dailyRate);
        System.out.println("Mileage       : " + mileage + " km");
        if (isAvailable) {
            System.out.println("Status        : Available");
        } else {
            System.out.println("Status        : Rented Out");
        }
        System.out.println("----------------------------------");
    }

    // Method 2: Calculate normal rental cost
    public double calculateTotalCost(int days) {
        return dailyRate * days;
    }

    // Method 3: Check service status (50,000 km limit)
    public void checkServiceStatus() {
        if (mileage >= 50000) {
            System.out.println("Alert: " + brand + " " + model + " needs servicing (Mileage: " + mileage + " km).");
        } else {
            System.out.println("Status: " + brand + " " + model + " is in good condition (Mileage: " + mileage + " km).");
        }
    }
}