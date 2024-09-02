package chatgpt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Factory Method
        ShapeFactory factory = new ConcreteShapeFactory();
        Shape circle = factory.createShape("circle");
        Shape rectangle = factory.createShape("rectangle");

        circle.draw();
        rectangle.draw();

        // Mediator
        ChatMediator mediator = new ChatRoom();
        User user1 = new User("Alice", mediator);
        User user2 = new User("Bob", mediator);

        user1.sendMessage("Olá, Bob!");
        user2.sendMessage("Oi, Alice!");

        // Visitor
        ComputerPart computer = new Computer(2);
        computer.accept(new ComputerPartDisplayVisitor());

        // Adapter
        MediaPlayer player = new MediaAdapter("vlc");
        player.play("vlc", "song.vlc");

        // Singleton
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println("Are both instances the same? " + (singleton == anotherSingleton));
        singleton.showMessage();
    }
// ---------------------------------------------------------------------------------------------------------------------------------
    static class Singleton {
        private static Singleton instance = new Singleton();;

        public static Singleton getInstance() {
            return instance;
        }

        public void showMessage() {
            System.out.println("Hello from Singleton instance!");
        }
    }

// ---------------------------------------------------------------------------------------------------------------------------------
    interface MediaPlayer {
        void play(String audioType, String fileName);
    }

    class AudioPlayer implements MediaPlayer {

        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("mp3")) {
                System.out.println("Playing mp3 file. Name: " + fileName);
            } else {
                System.out.println("Invalid media. " + audioType + " format not supported");
            }
        }
    }

    interface AdvancedMediaPlayer {
        void playVlc(String fileName);
        void playMp4(String fileName);
    }

    static class MediaAdapter implements MediaPlayer {
        private AdvancedMediaPlayer advancedMusicPlayer;
    
        public MediaAdapter(String audioType) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer = new VlcPlayer();
            }
        }
    
        @Override
        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer.playVlc(fileName);
            }
            else if (audioType.equalsIgnoreCase("mp4")) {
                advancedMusicPlayer.playMp4(fileName);
            }
        }
    }

    static class VlcPlayer implements AdvancedMediaPlayer {
        public void playVlc(String fileName) {
            System.out.println("Playing vlc file. Name: " + fileName);
        }

        public void playMp4(String fileName) {
            System.out.println("Playing vlc file. Name: " + fileName);
        }
    }

// ---------------------------------------------------------------------------------------------------------------------------------
    interface ComputerPart {
        void accept(Visitor visitor);
    }

    static class Computer implements ComputerPart{
        private int RAM;

        Computer(int RAM) {
            this.RAM = RAM;
        }

        public int getRAM() {
            return RAM;
        }

        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    interface Visitor {
        void visit(Computer computer);
    }

    static class ComputerPartDisplayVisitor implements Visitor {
        @Override
        public void visit(Computer computer) {
            System.out.println("Computer RAM: " + computer.getRAM());
        }
    }

    static class User {
        private String name;
        private ChatMediator mediator;

        public User(String name, ChatMediator mediator) {
            this.name = name;
            this.mediator = mediator;
        }

        public void sendMessage(String message) {
            System.out.println("[" + name + "] sent a message through the mediator");
            mediator.sendMessage(this, message);
        }

        public void receiveMessage(String message) {
            System.out.println("[" + name + "] received a message");
        }
    
        public String getName() {
            return name;
        }
    }

    interface ChatMediator {
        void addUser(User user);
        void sendMessage(User sender, String message);
    }

    static class ChatRoom implements ChatMediator {
        private ArrayList<User> users = new ArrayList<>();

        public void addUser(User user) {
            System.out.println("[" + user.getName() + "] joined the chat");
            users.add(user);
        }

        public void sendMessage(User sender, String message) {
            for (User user : users) {
              if (user != sender) {
                user.receiveMessage(message);
              }
            }
          }
    }
// ---------------------------------------------------------------------------------------------------------------------------------
    interface ShapeFactory {
        Shape createShape(String type);
    }

    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        public void draw() {
            System.out.println("Drawning");
        }
    }

    static class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawning");
        }
    }

    static class ConcreteShapeFactory implements ShapeFactory {
        public Shape createShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        } else if (type.equals("rectangle")) {
            return new Rectangle();
        } else {
            return null;
        }
    }
    }
}

