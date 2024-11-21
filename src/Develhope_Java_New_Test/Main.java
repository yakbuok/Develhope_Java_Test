package Develhope_Java_New_Test;

import java.util.List;

public class Main { // Main Function

    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        // Create some housing
        Housing apartment1 = new Housing("Apartment", 5, 50, 500, "123 Kasanga", "Kampala");
        Housing villa1 = new Housing("Vila", 4, 200, 300, "456 Beach Rd", "Kampala");

        rentalSystem.addHousing(apartment1);
        rentalSystem.addHousing(villa1);


        // Create a customer
        Customer customer1 = new Customer("Hanna", "789 Kampala", 30);

        // Rent housing
        rentalSystem.rentHousing(apartment1, customer1, 5);
        rentalSystem.rentHousing(villa1, customer1, 3);

        // Check total income for apartment1
        double income = rentalSystem.calculateTotalIncome(apartment1);
        System.out.println("Total income for apartment1: " + income);

        // Get last rentals for customer1
        List<Rental> lastRentals = rentalSystem.getLastRentalsByCustomer(customer1, 5);
        System.out.println("Last rentals for " + customer1.getName() + ": " + lastRentals.size());
    }
}




