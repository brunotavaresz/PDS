package lab10.ex2;

public class DessertChef extends Chef {
    public void handleOrder(String order) {
        if (order.contains("dessert")) {
            System.out.println("DessertChef: I can handle the " + order + " order.");
        } else {
            System.out.println("DessertChef: I can't handle this order.");
            super.handleOrder(order);
        }
    }
    
}
