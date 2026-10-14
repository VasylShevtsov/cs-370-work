
package edu.whitman;

import java.util.HashMap;

public class Museum {
    private String name;
    private HashMap<Integer, Ticket> tickets;

    public Museum(String name) {
        this.name = name;
        this.tickets = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addTicket(Ticket ticket) {
        tickets.put(ticket.getId(), ticket);
    }

    public void removeTicket(int id) {
        tickets.remove(id);
    }

    public HashMap<Integer, Ticket> getAvailableTickets() {
        return new HashMap<>(tickets);
    }

}