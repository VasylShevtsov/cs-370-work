package edu.whitman;

public class Renter {
    private int id;
    private String name;
    private Apartment apartment;

    public Renter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void rentApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public boolean hasApartment() {
        return apartment != null;
    }

    public void moveOut() {
        this.apartment = null;
    }
}
