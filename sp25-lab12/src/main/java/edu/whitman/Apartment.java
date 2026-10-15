package edu.whitman;

public class Apartment {
    private int id;
    private String address;
    private int unitNumber;
    private boolean isOccupied;

    public Apartment(int id, String address, int unitNumber) {
        this.id = id;
        this.address = address;
        this.unitNumber = unitNumber;
        this.isOccupied = false;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void markOccupied() {
        this.isOccupied = true;
    }

    public void markVacant() {
        this.isOccupied = false;
    }
}
