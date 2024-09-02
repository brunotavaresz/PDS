package mediator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();
        Colleague c1 = new Colleague(mediator);
        Colleague c2 = new Colleague(mediator);
        mediator.addColleague(c1);
        mediator.addColleague(c2);
        c1.sendMessage();
        c2.sendMessage();
        c1.sendMessage();
        c2.sendMessage();
    }

    interface Mediator {
        void sendMessage();
    }

    static class Colleague implements Mediator {
        private Mediator mediator;

        public Colleague(Mediator mediator){
            this.mediator = mediator;
        }

        public void sendMessage() {
            mediator.sendMessage();
        }

        public void receiveMessage() {
            System.out.println("Message received");
        }
    }

    static class ChatMediator implements Mediator {
        private List<Colleague> colleagues = new ArrayList<Colleague>();

        public void addColleague(Colleague colleague) {
            colleagues.add(colleague);
        }

        public void sendMessage() {
            for (Colleague colleague : colleagues) {
                colleague.receiveMessage();
            }
        }
        
    }
}