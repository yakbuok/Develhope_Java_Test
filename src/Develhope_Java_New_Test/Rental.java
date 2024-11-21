package Develhope_Java_New_Test;

public class Rental { // rental Class start from Here
    private Housing housing;
    private Customer customer;
    private int daysRented;

    public Rental(Housing housing, Customer customer, int daysRented) {
        this.housing = housing;
        this.customer = customer;
        this.daysRented = daysRented;
        housing.rent();
        customer.addRental(this);
    }

    public double calculateIncome() {
        return housing.getPricePerDay() * daysRented;
    }

    public Housing getHousing() {
        return housing;
    }
}


