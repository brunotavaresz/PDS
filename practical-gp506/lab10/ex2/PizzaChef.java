package lab10.ex2;

public class PizzaChef extends Chef {
    public void handleOrder(String order) {
        if (order.contains("pizza")) {
            System.out.println("PizzaChef: I can handle the " + order + " order.");
        } else {
            System.out.println("PizzaChef: I can't handle this order.");
            super.handleOrder(order);
        }
    }
    
}
