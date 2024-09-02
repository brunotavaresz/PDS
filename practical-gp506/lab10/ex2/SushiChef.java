package lab10.ex2;

public class SushiChef extends Chef {
    public void handleOrder(String order) {
        if (order.contains("sushi")) {
            System.out.println("SushiChef: I can handle the " + order + " order.");
        } else {
            System.out.println("SushiChef: I can't handle this order.");
            super.handleOrder(order);
        }
    }
}
