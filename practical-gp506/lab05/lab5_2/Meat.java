package lab5_2;

public class Meat implements Portion{
    private String name;
    private Temperature temperature;
    private State state;


    public Meat(String name, State state, Temperature temperature) {
        this.name = name;
        this.temperature = temperature;
        this.state = state;
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

    public String toString() {
        return name + ": Temperature " + temperature + ", State " + state;
    }
}
