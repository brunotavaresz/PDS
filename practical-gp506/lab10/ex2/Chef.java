package lab10.ex2;

public abstract class Chef implements ChefInterface{
    private Chef next = null;

    public Chef setNextChef(Chef next) {
        this.next = next;
        return next;
    }

    public void handleOrder(String order) {
        if (next != null) {
            next.handleOrder(order);
        }
        else {
            System.out.println("We are sorry, we can't handle this order.");
        }
    }
}
