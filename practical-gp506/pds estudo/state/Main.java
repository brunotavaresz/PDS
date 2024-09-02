package state;

public class Main {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan(); //ventoinha
        System.out.println("Current state: " + fan.getState());
        fan.pull(); // Turn on low speed
        System.out.println("Current state: " + fan.getState());
        fan.pull(); // Switch to medium speed
        System.out.println("Current state: " + fan.getState());
        fan.pull(); // Switch to high speed
        System.out.println("Current state: " + fan.getState());
        fan.pull(); // Turn off the fan
        System.out.println("Current state: " + fan.getState());
    }
    
    interface State {
        void pull(CeilingFan fan);
    }

    static class CeilingFan {
        private State state;

        public CeilingFan() {
            this.state = Off.getInstance();
        }

        public void pull() {
            state.pull(this);
        }

        public String getState() {
            return state.getClass().getSimpleName();
        }

        public void setState(State state) {
            this.state = state;
        }
    }

    static class Off implements State {
        private static Off instance = new Off();

        private Off(){
        }

        public static Off getInstance() {
            return instance;
        }

        public void pull(CeilingFan fan) {
            fan.setState(LowSpeedState.getInstance());
        }
    }

    static class LowSpeedState implements State{
        private static LowSpeedState instance = new LowSpeedState();
    
        private LowSpeedState() {
        }
    
        public static LowSpeedState getInstance() {
            return instance;
        }
    
        @Override
        public void pull(CeilingFan fan) {
            fan.setState(MediumSpeedState.getInstance());
        }
        
    }

    static class MediumSpeedState implements State{
        private static MediumSpeedState instance = new MediumSpeedState();
    
        private MediumSpeedState() {
        }
    
        public static MediumSpeedState getInstance() {
            return instance;
        }
    
        @Override
        public void pull(CeilingFan fan) {
            fan.setState(HighSpeedState.getInstance());
        }
        
    }

    static class HighSpeedState implements State{
        private static HighSpeedState instance = new HighSpeedState();
    
        private HighSpeedState() {
        }
    
        public static HighSpeedState getInstance() {
            return instance;
        }
    
        @Override
        public void pull(CeilingFan fan) {
            fan.setState(Off.getInstance());
        }
    
    }
}
