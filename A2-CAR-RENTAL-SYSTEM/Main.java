import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Instantiate Base Class (Lamborghini Axia)
        RentalCar car1 = new RentalCar();

        // 2. Instantiate Derived Class 1 (ElectricCar - Tesla Saga EV)
        ElectricCar car2 = new ElectricCar("C002", "Tesla", "Saga EV", "EV 2026", 150.00, 45000, true, 75);

        // 3. Instantiate Derived Class 2 (LuxurySportsCar - McLaren Myvi)
        LuxurySportsCar car3 = new LuxurySportsCar("C003", "McLaren", "Myvi", "SRG 1010", 300.00, 35000, true, 600);

        // 4. Instantiate the 3 Additional Classes
        Customer customer1 = new Customer("CUST01", "Iftikhar", "012-3456789");
        RentalInvoice invoice1 = new RentalInvoice("INV-100", 0.0);
        ServiceRecord service1 = new ServiceRecord("SRV-01", "Rafiq", 250.00);

        int choice = 0;

        System.out.println("==========================================");
        System.out.println("     WELCOME TO CAR RENTAL SYSTEM         ");
        System.out.println("==========================================");

        // While loop to keep showing the menu until user chooses 7
        while (choice != 7) {
            System.out.println("\nMAIN MENU:");
            System.out.println("1. View All Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Update Car Daily Rate");
            System.out.println("5. Check Service Status");
            System.out.println("6. Test Special Features & Customer Info");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            choice = input.nextInt();

            // Switch statement to handle menu choices
            switch (choice) {

                // Display all car details
                case 1:
                    System.out.println("\n--- CAR 1 (STANDARD CAR) ---");
                    car1.displayCarInfo();
                    System.out.println("\n--- CAR 2 (ELECTRIC CAR) ---");
                    car2.displayCarInfo();
                    System.out.println("\n--- CAR 3 (LUXURY SPORTS CAR) ---");
                    car3.displayCarInfo();
                    break;

                // Rent a car
                case 2:
                    System.out.print("\nSelect Car to rent (1 for Axia, 2 for Saga EV, 3 for Myvi): ");
                    int rentChoice = input.nextInt();
                    RentalCar selectedCar = null;

                    // If-else statement to select the car
                    if (rentChoice == 1) {
                        selectedCar = car1;
                    } else if (rentChoice == 2) {
                        selectedCar = car2;
                    } else if (rentChoice == 3) {
                        selectedCar = car3;
                    } else {
                        System.out.println("Invalid car selection!");
                        break;
                    }

                    // Check if the selected car is available for rent
                    if (selectedCar.getIsAvailable()) {
                        System.out.print("Enter number of days to rent: ");
                        int days = input.nextInt();

                        // For loop to show daily rate breakdown
                        System.out.println("\n--- Daily Breakdown ---");
                        for (int i = 1; i <= days; i++) {
                            System.out.println("Day " + i + ": RM " + selectedCar.getDailyRate());
                        }

                        // Polymorphism: calls the matching calculateTotalCost() method
                        double total = selectedCar.calculateTotalCost(days);
                        selectedCar.setIsAvailable(false);

                        // Update and print RentalInvoice object
                        invoice1.setTotalAmount(total);
                        invoice1.printReceipt(customer1.getName(), selectedCar.getBrand() + " " + selectedCar.getModel(), days);
                    } else {
                        System.out.println("Sorry! That car is already rented out.");
                    }
                    break;

                // Return a car
                case 3:
                    System.out.print("\nSelect Car to return (1 for Axia, 2 for Saga EV, 3 for Myvi): ");
                    int returnChoice = input.nextInt();
                    RentalCar returnCar = null;

                    if (returnChoice == 1) {
                        returnCar = car1;
                    } else if (returnChoice == 2) {
                        returnCar = car2;
                    } else if (returnChoice == 3) {
                        returnCar = car3;
                    } else {
                        System.out.println("Invalid car selection!");
                        break;
                    }

                    if (!returnCar.getIsAvailable()) {
                        System.out.print("Enter distance driven (km): ");
                        int distance = input.nextInt();

                        returnCar.setMileage(returnCar.getMileage() + distance);
                        returnCar.setIsAvailable(true);
                        System.out.println("Car returned! New Mileage: " + returnCar.getMileage() + " km.");
                    } else {
                        System.out.println("This car is already in the garage.");
                    }
                    break;

                // Update car daily rate
                case 4:
                    System.out.print("\nSelect Car to update rate (1 for Axia, 2 for Saga EV, or 3 Myvi): ");
                    int rateChoice = input.nextInt();
                    System.out.print("Enter new Daily Rate: RM ");
                    double newRate = input.nextDouble();

                    if (rateChoice == 1) {
                        car1.setDailyRate(newRate);
                    } else if (rateChoice == 2) {
                        car2.setDailyRate(newRate);
                    } else if (rateChoice == 3) {
                        car3.setDailyRate(newRate);
                    } else {
                        System.out.println("Invalid car selection!");
                    }
                    break;

                // Check service status
                case 5:
                    System.out.println("\n--- CHECKING SERVICE STATUS ---");
                    // Polymorphism: each car checks its own mileage limit
                    car1.checkServiceStatus();
                    car2.checkServiceStatus();
                    car3.checkServiceStatus();

                    // Display ServiceRecord class details
                    service1.displayServiceLog();
                    break;

                // Test special features and display customer info
                case 6:
                    System.out.println("\n--- CUSTOMER DETAILS ---");
                    customer1.displayCustomerInfo();

                    System.out.println("\n--- CAR DETAILS  ---");
                    car2.chargeBattery();
                    car3.activateSportMode();
                    break;

                // Exit the program
                case 7:
                    System.out.println("Thank you for using the Car Rental System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 7.");
            }
        }
        input.close();
    }
}