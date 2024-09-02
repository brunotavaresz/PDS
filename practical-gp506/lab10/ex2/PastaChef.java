package lab10.ex2;

public class PastaChef extends Chef {
    public void handleOrder(String order) {
        if (order.contains("pasta")) {
            System.out.println("PastaChef: I can handle the " + order + " order.");
        } else {
            System.out.println("PastaChef: I can't handle this order.");
            super.handleOrder(order);
        }
    }   
}
