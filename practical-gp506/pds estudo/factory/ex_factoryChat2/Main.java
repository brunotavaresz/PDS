package factory.ex_factoryChat2;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // Criação de personagens
        Character warrior = factory.createCharacter("Warrior", "Arthur");
        Character mage = factory.createCharacter("Mage", "Merlin");
        Character archer = factory.createCharacter("Archer", "Robin Hood");

        // Exibição das informações dos personagens
        System.out.println("Informações dos personagens:");
        System.out.println(warrior.toString());
        System.out.println(mage.toString());
        System.out.println(archer.toString());
    }

    interface Character {
        String toString();
    }

    static class CharacterFactory {
        public Character createCharacter(String type, String name) {
            if (type.equals("Warrior")) {
                return new Guerreiro(type, name);
            } else if (type.equals("Mage")) {
                return new Mago(type, name);
            } else if (type.equals("Archer")) {
                return new Arqueiro(type, name);
            } else {
                return null;
            }
        }
    }

    static class Guerreiro implements Character {
        String name;
        String type;

        Guerreiro(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public String toString() {
            return "name: " + name + "\n" + "tipo: " + type;
        }
    }

    static class Mago implements Character {
        String name;
        String type;

        Mago(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public String toString() {
            return "name: " + name + "\n" + "tipo: " + type;
        }
    }

    static class Arqueiro implements Character {
        String name;
        String type;

        Arqueiro(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public String toString() {
            return "name: " + name + "\n" + "tipo: " + type;
        }
    }
}


