package Develhope_Java_New_Test;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private int age;
    private List<Rental> rentals;

    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public List<Rental> getLastRentals(int maxRentals) {
        int start = Math.max(0, rentals.size() - maxRentals);
        return rentals.subList(start, rentals.size());
    }

    public String getName() {
        return name;
    }
}


