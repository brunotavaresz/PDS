package lab5_2;

public class PortionFactory {
    public static Portion create(String type, Temperature temperature) {
        if (temperature.equals(Temperature.COLD)) {
            if (type.equals("Beverage")) {
                return new Beverage("FruitJuice",State.Liquid, Temperature.COLD, "Orange");
            } else if (type.equals("Meat")) {
                return new Meat("Tuna",State.Solid, Temperature.COLD);
            }
        } else if (temperature.equals(Temperature.WARM)) {
            if (type.equals("Beverage")) {
                return new Beverage("Milk",State.Liquid, Temperature.WARM);
            } else if (type.equals("Meat")) {
                return new Meat("Pork", State.Solid, Temperature.WARM);
            }
        }
        return null; // return null if the type is not recognized
    }
}
