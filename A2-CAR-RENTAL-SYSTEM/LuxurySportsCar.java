// Subclass inheriting attributes and methods from RentalCar
public class LuxurySportsCar extends RentalCar {

    // Private attribute for LuxurySportsCar
    private int horsepower;

    // Parameterized Constructor using super()
    public LuxurySportsCar(String carId, String brand, String model, String plateNumber,
                           double dailyRate, int mileage, boolean isAvailable, int horsepower) {
        super(carId, brand, model, plateNumber, dailyRate, mileage, isAvailable);
        this.horsepower = horsepower;
    }

    // Getter and Setter
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Method to activate sport mode for the luxury sports car
    public void activateSportMode() {
        System.out.println(getBrand() + " " + getModel() + " Sport Mode ON! Engine roaring at " + horsepower + " HP!");
    }

    // Overridden method to display car information along with horsepower
    @Override
    public void displayCarInfo() {
        super.displayCarInfo();
        System.out.println("Car Type      : Luxury Sports Car");
        System.out.println("Horsepower    : " + horsepower + " HP");
        System.out.println("----------------------------------");
    }

    // Overridden method to calculate total rental cost with RM 100.00 Luxury Insurance Fee
    @Override
    public double calculateTotalCost(int days) {
        double total = (getDailyRate() * days) + 100.00;
        System.out.println("(Luxury Insurance Fee of RM 100.00 added!)");
        return total;
    }

    // Overridden method to check the engine service status based on mileage
    @Override
    public void checkServiceStatus() {
        // Selection structure: using if-else to check if mileage reaches 30,000 km
        if (getMileage() >= 30000) {
            System.out.println("Sports Alert: " + getBrand() + " " + getModel() + " needs engine tuning (Mileage: " + getMileage() + " km).");
        } else {
            System.out.println("Sports Status: " + getBrand() + " " + getModel() + " engine is ready (Mileage: " + getMileage() + " km).");
        }
    }
}