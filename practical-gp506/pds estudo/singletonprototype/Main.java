package singletonprototype;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Criação da fábrica de computadores (Singleton)
        ComputerFactory factory = ComputerFactory.getInstance();

        // Registrando protótipos de computadores
        DesktopPrototype desktopPrototype = new DesktopPrototype();
        LaptopPrototype laptopPrototype = new LaptopPrototype();
        TabletPrototype tabletPrototype = new TabletPrototype();

        factory.registerPrototype("desktop", desktopPrototype);
        factory.registerPrototype("laptop", laptopPrototype);
        factory.registerPrototype("tablet", tabletPrototype);

        // Criação de um desktop
        Computer desktop = factory.createComputer("desktop");
        if (desktop != null) {
            System.out.println("Características do Desktop:");
            desktop.displayInfo();
        }

        // Criação de um laptop
        Computer laptop = factory.createComputer("laptop");
        if (laptop != null) {
            System.out.println("\nCaracterísticas do Laptop:");
            laptop.displayInfo();
        }

        // Criação de um tablet
        Computer tablet = factory.createComputer("tablet");
        if (tablet != null) {
            System.out.println("\nCaracterísticas do Tablet:");
            tablet.displayInfo();
        }
    }

    interface Prototype {
        Prototype clone();
    }

    static class DesktopPrototype implements Prototype {  
        @Override
        public Prototype clone() {
            return new DesktopPrototype();
        }
    }

    static class LaptopPrototype implements Prototype {

        @Override
        public Prototype clone() {
            return new LaptopPrototype();
        }
    }

    static class TabletPrototype implements Prototype {
    
        @Override
        public Prototype clone() {
            return new TabletPrototype();
        }
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
        private static ComputerFactory instance;
        private final Map<String, Prototype> prototypes = new HashMap<>();

        public static ComputerFactory getInstance(){
            if (instance == null) {
                instance = new ComputerFactory();
            }
        return instance;
        }

        public Computer createComputer(String type) {
            Prototype prototype = prototypes.get(type);
            if (prototype != null) {
                return (Computer) prototype.clone();
            }
            return null;
        }

        public void registerPrototype(String key, Prototype prototype) {
            prototypes.put(key, prototype);
        }


    }
}
