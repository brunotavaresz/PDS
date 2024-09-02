package lab5_2;

public class Beverage implements Portion{
    private String name;
    private Temperature temperature;
    private State state;
    private String type;


    public Beverage(String name, State state, Temperature temperature) {
        this.name = name;
        this.temperature = temperature;
        this.state = state;
    }


    public Beverage(String name, State state, Temperature temperature, String type) {
        this.name = name;
        this.temperature = temperature;
        this.state = state;
        this.type = type;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        if (type != null) {
            return name + ": " + type + ", Temperature " + temperature + ", State " + state;
        } else {
            return name + ": Temperature " + temperature + ", State " + state;
        }
    }

}
