package lab10.ex2;

public class Main {
    public static void main(String[] args) {
        Chef chef1 = new BurgerChef();
        Chef chef2 = new PastaChef();
        Chef chef3 = new PizzaChef();
        Chef chef4 = new BurgerChef();
        Chef chef5 = new DessertChef();
        Chef chef6 = new SushiChef();
        chef1.setNextChef(chef2).setNextChef(chef3).setNextChef(chef4).setNextChef(chef5).setNextChef(chef6);

        System.out.println("\nCan I please get a veggie burger?");
        chef1.handleOrder("veggie burger");

        System.out.println("\nCan I please get a Pasta Carbonara?");
        chef1.handleOrder("pasta carbonara");

        System.out.println("\nCan I please get a Margherita PLAIN pizza, no toppings?");
        chef1.handleOrder("Margherita PLAIN pizza, no toppings");

        System.out.println("\nCan I please get a sushi nigiri and sashimi?");
        chef1.handleOrder("sushi nigiri and sashimi");

        System.out.println("\nCan I please get a salad with tuna?");
        chef1.handleOrder("salad with tuna");

        System.out.println("\nCan I please get a strawberry ice cream and waffles dessert?");
        chef1.handleOrder("strawberry ice cream and waffles dessert");

        System.out.println("\nCan I please get a chicken grill?");
        chef1.handleOrder("chicken grill");

    }
}
