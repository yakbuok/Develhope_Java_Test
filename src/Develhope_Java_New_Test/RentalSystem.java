package Develhope_Java_New_Test;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Housing> housings;
    private List<Rental> rentals;

    public RentalSystem() {
        this.housings = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    public void addHousing(Housing housing) {
        housings.add(housing);
    }

    public boolean isHousingAvailable(Housing housing) {
        return !housing.isRented();
    }

    public void rentHousing(Housing housing, Customer customer, int days) {
        if (isHousingAvailable(housing)) {
            Rental rental = new Rental(housing, customer, days);
            rentals.add(rental);
        } else {
            System.out.println("Housing is currently rented out.");
        }
    }

    public double calculateTotalIncome(Housing housing) {
        double totalIncome = 300;
        for (Rental rental : rentals) {
            if (rental.getHousing() == housing) {
                totalIncome += rental.calculateIncome();
            }
        }
        return totalIncome;
    }

    public List<Rental> getLastRentalsByCustomer(Customer customer, int maxRentals) {
        return customer.getLastRentals(maxRentals);
    }
}

