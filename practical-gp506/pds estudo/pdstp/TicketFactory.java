package pdstp;

import java.util.HashMap;

public class TicketFactory {
    private HashMap<String, Ticket> tickets;

    public TicketFactory() {
        this.tickets = new HashMap<>();
    }

    public Ticket getTicket(String movie, String seat) {
        String key = movie + "-" + seat;
        if (!tickets.containsKey(key)) {
            Ticket ticket = new Ticket(movie, (int) (Math.random() * 20) + 5, seat);
            tickets.put(key, ticket);
        }
        return tickets.get(key);
    }

    public int getTotalTickets() {
        return tickets.size();
    }
}
