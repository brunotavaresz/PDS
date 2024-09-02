package pdstp;

public class TicketCounter {
    private TicketFactory ticketFactory;

    public TicketCounter() {
        this.ticketFactory = new TicketFactory();
    }

    public void buyTicket(String movie, String seat) {
        Ticket ticket = ticketFactory.getTicket(movie, seat);
        System.out.println("Ticket for " + movie + " at seat " + seat + " is purchased.");
    }
}
