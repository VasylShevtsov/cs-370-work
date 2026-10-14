package edu.whitman;

public class Ticket {
    private int id;
    private String type;
    private String seatNumber;
    private double price;

    public Ticket(int id, String type, String seatNumber, double price) {
        this.id = id;
        this.type = type;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() 
    return price;
    }
}
