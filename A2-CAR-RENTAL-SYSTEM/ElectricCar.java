// Subclass inheriting attributes and methods from RentalCar
public class ElectricCar extends RentalCar {

    // Distinctive private attribute for ElectricCar
    private int batteryCapacity;

    // Parameterized Constructor using super()
    public ElectricCar(String carId, String brand, String model, String plateNumber,
                       double dailyRate, int mileage, boolean isAvailable, int batteryCapacity) {
        super(carId, brand, model, plateNumber, dailyRate, mileage, isAvailable);
        this.batteryCapacity = batteryCapacity;
    }

    // Getter and Setter
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    // Method to simulate charging the electric car battery
    public void chargeBattery() {
        System.out.println(getBrand() + " " + getModel() + " is now charging its " + batteryCapacity + " kWh battery to 100%.");
    }

    // Overridden method to display car information along with battery capacity
    @Override
    public void displayCarInfo() {
        super.displayCarInfo();
        System.out.println("Car Type      : Electric Car (EV)");
        System.out.println("Battery Size  : " + batteryCapacity + " kWh");
        System.out.println("----------------------------------");
    }

    // Overridden method to calculate total rental cost with RM 20.00 EV Green Discount
    @Override
    public double calculateTotalCost(int days) {
        double total = (getDailyRate() * days) - 20.00;
        System.out.println("(EV Green Discount of RM 20.00 applied!)");
        return total;
    }
    
    // Overridden method to check the battery service status based on mileage
    @Override
    public void checkServiceStatus() {
        // Selection structure: using if-else to check if mileage reaches 40,000 km
        if (getMileage() >= 40000) {
            System.out.println("EV Alert: " + getBrand() + " " + getModel() + " needs battery service (Mileage: " + getMileage() + " km).");
        } else {
            System.out.println("EV Status: " + getBrand() + " " + getModel() + " battery is healthy (Mileage: " + getMileage() + " km).");
        }
    }
}