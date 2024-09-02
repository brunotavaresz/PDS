package lab10.ex2;

public class BurgerChef extends Chef{
    public void handleOrder(String order) {
        if (order.contains("burger")) {
            System.out.println("BurgerChef: I can handle the + " + order + " order.");
        } else {
            System.out.println("BurgerChef: I can't handle this order.");
            super.handleOrder(order);
        }
    }
}
