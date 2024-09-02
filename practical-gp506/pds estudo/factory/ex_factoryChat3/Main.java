package factory.ex_factoryChat3;

public class Main {

    public static void main(String[] args) {
        // Criação da fábrica de computadores
        ComputerFactory factory = new ComputerFactory();

        // Criação de um desktop
        Computer desktop = factory.createComputer("desktop");
        System.out.println("Características do Desktop:");
        desktop.displayInfo();

        // Criação de um laptop
        Computer laptop = factory.createComputer("laptop");
        System.out.println("\nCaracterísticas do Laptop:");
        laptop.displayInfo();

        // Criação de um tablet
        Computer tablet = factory.createComputer("tablet");
        System.out.println("\nCaracterísticas do Tablet:");
        tablet.displayInfo();
    }

    interface Computer {
        void displayInfo();
    }

    static class Desktop implements Computer {
        public void displayInfo() {
            System.out.println("marca: Motorola; Memoria: 2");
        }
    }

    static class Laptop implements Computer {
        public void displayInfo() {
            System.out.println("marca: Apple; Memoria: 5");
        }
    }

    static class Tablet implements Computer {
        public void displayInfo() {
            System.out.println("marca: Samsung; Memoria: 1");
        }
    }

    static class ComputerFactory {
        public Computer createComputer(String type) {
            if (type.equals("desktop")){
                return new Desktop();
            }
            else if (type.equals("laptop")) {
                return new Laptop();
            }
            else if (type.equals("tablet")) {
                return new Tablet();
            }
            else {
                return null;
            }
        } 
    }


}

