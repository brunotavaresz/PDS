package ex3;

public class Main {
    public static void main(String[] args) {
        Mediator trafficControl = new Mediator();

        Airplane airplane1 = new Airplane("Airplane 1", trafficControl);
        Airplane airplane2 = new Airplane("Airplane 2", trafficControl);
        Airplane airplane3 = new Airplane("Airplane 3", trafficControl);

        trafficControl.registerAirplane(airplane1);
        trafficControl.registerAirplane(airplane2);
        trafficControl.registerAirplane(airplane3);

        airplane1.sendMessage("Im airplane 1 and I want to land");
        System.out.println();
        airplane2.sendMessage("Im airplane 2 and I want to take off");
    }
    
}
