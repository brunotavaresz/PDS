package pdstp;

public class Main {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();

        ticketCounter.buyTicket("Avengers: Endgame", "A1");
        ticketCounter.buyTicket("Avengers: Endgame", "B2");
        ticketCounter.buyTicket("Joker", "C3");
        ticketCounter.buyTicket("Avengers: Endgame", "D4");
        ticketCounter.buyTicket("Joker", "E5");

        TicketFactory ticketFactory = new TicketFactory();
        System.out.println("Total Movies Offered: " + ticketFactory.getTotalTickets());
    }
}
