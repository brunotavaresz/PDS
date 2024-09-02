package pdstp;

public class Ticket {
    private String movie;
    private int price;
    private String seat;

    public Ticket(String movie, int price, String seat) {
        this.movie = movie;
        this.price = price;
        this.seat = seat;
    }

    public String getMovie() {
        return movie;
    }

    public String getSeat() {
        return seat;
    }
}
