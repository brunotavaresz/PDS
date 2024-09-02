package ex3;
import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Airplane> airplanes;

    public Mediator() {
        airplanes = new ArrayList<>();
    }

    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    public void sendMessage(Airplane sender, String message) {
        for (Airplane airplane : airplanes) {
            if (airplane != sender) {
                airplane.receiveMessage(message);
            }
        }
    }
}