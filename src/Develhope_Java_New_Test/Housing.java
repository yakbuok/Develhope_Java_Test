package Develhope_Java_New_Test;
import java.util.List;

/*
Exam

You are tasked with designing a housing rental system. The system has to manage different types of housing (apartment, villa). It also needs to save information about customers who rent the housing.

House information:

number of rooms
size in m2
price per day
address
city
Customer information:

Name
Address
Age
When designing this system, have in mind the features that the users will need:

check if the housing is currently free or rented out
calculate total rental income per housing
get a list of max last 5 rentals per customer


 */


public class Housing {
    private String type; // e.g., "Apartment", "Villa"
    private int numberOfRooms;
    private double size; // in m2
    private double pricePerDay;
    private String address;
    private String city;
    private boolean isRented;

    public Housing(String type, int numberOfRooms, double size, double pricePerDay, String address, String city) {
        this.type = type;
        this.numberOfRooms = numberOfRooms;
        this.size = size;
        this.pricePerDay = pricePerDay;
        this.address = address;
        this.city = city;
        this.isRented = false;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        this.isRented = true;
    }

    public void returnHousing() {
        this.isRented = false;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }
}