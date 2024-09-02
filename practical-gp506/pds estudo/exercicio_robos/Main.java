package exercicio_robos;

// Imports necessários para a implementação
import java.util.ArrayList;
import java.util.List;

// Interface RobotFactory (Factory Pattern)
interface RobotFactory {
    Robot createRobot(String type);
}

// Interface Robot (Adapter Pattern + State Pattern)
interface Robot {
    void move();
    void kick();
    void accept(RobotVisitor visitor);
    void setState(RobotState state);
}

// Interface PhysicsEngineAdapter (Adapter Pattern)
interface PhysicsEngineAdapter {
    void move();
    void kick();
}

// Interface GameMediator (Mediator Pattern)
class GameMediator {
    private List<Robot> robots = new ArrayList<>();

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void notifyKick(Robot robot) {
        System.out.println("Mediator: Notifying kick to other robots");
        for (Robot r : robots) {
            if (r != robot) {
                r.accept(new KickVisitor());
            }
        }
    }
}

// ConcreteRobotFactory (Factory Pattern)
class ConcreteRobotFactory implements RobotFactory {
    @Override
    public Robot createRobot(String type) {
        if (type.equalsIgnoreCase("Striker")) {
            return new StrikerRobot();
        } else if (type.equalsIgnoreCase("Goalkeeper")) {
            return new GoalkeeperRobot();
        }
        return null;
    }
}

// ConcreteRobot implements Robot (Adapter Pattern + State Pattern)
class StrikerRobot implements Robot {
    private RobotState state;

    public StrikerRobot() {
        this.state = new DefaultState();
    }

    @Override
    public void move() {
        System.out.println("Striker Robot is moving");
    }

    @Override
    public void kick() {
        System.out.println("Striker Robot is kicking the ball");
    }

    @Override
    public void accept(RobotVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setState(RobotState state) {
        this.state = state;
    }
}

// ConcreteRobot implements Robot (Adapter Pattern + State Pattern)
class GoalkeeperRobot implements Robot {
    private RobotState state;

    public GoalkeeperRobot() {
        this.state = new DefaultState();
    }

    @Override
    public void move() {
        System.out.println("Goalkeeper Robot is moving to intercept");
    }

    @Override
    public void kick() {
        System.out.println("Goalkeeper Robot is clearing the ball");
    }

    @Override
    public void accept(RobotVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setState(RobotState state) {
        this.state = state;
    }
}

// Adapter Pattern (Adapting different physics engines)
class MotorAAdapter implements PhysicsEngineAdapter {
    @Override
    public void move() {
        System.out.println("Motor A: Moving robot according to physics engine A");
    }

    @Override
    public void kick() {
        System.out.println("Motor A: Kicking the ball according to physics engine A");
    }
}

class MotorBAdapter implements PhysicsEngineAdapter {
    @Override
    public void move() {
        System.out.println("Motor B: Moving robot according to physics engine B");
    }

    @Override
    public void kick() {
        System.out.println("Motor B: Kicking the ball according to physics engine B");
    }
}

// Visitor Pattern (Visitor interface)
interface RobotVisitor {
    void visit(StrikerRobot strikerRobot);
    void visit(GoalkeeperRobot goalkeeperRobot);
}

// Visitor Pattern (Concrete visitors)
class KickVisitor implements RobotVisitor {
    @Override
    public void visit(StrikerRobot strikerRobot) {
        System.out.println("Visitor: Striker Robot is practicing kicks");
    }

    @Override
    public void visit(GoalkeeperRobot goalkeeperRobot) {
        System.out.println("Visitor: Goalkeeper Robot is practicing saves");
    }
}

// State Pattern (State interface)
interface RobotState {
    // Methods related to state transitions
}

// State Pattern (Concrete states)
class DefaultState implements RobotState {
    // Default state implementation
}

// State Pattern (Concrete states)
class AttackingState implements RobotState {
    // Attacking state implementation
}

// Main class
public class Main {
    public static void main(String[] args) {
        // 1. Criação da fábrica de robôs
        RobotFactory factory = new ConcreteRobotFactory();

        // 2. Criação dos robôs utilizando a fábrica
        Robot striker = factory.createRobot("Striker");
        Robot goalkeeper = factory.createRobot("Goalkeeper");

        // 3. Adaptadores para motores de física
        PhysicsEngineAdapter motorA = new MotorAAdapter();
        PhysicsEngineAdapter motorB = new MotorBAdapter();

        // 4. Definição dos mediadores para gerenciar a interação entre os robôs e o campo de jogo
        GameMediator gameMediator = new GameMediator();

        // 5. Definição dos estados dos robôs
        striker.setState(new AttackingState());
        goalkeeper.setState(new DefaultState());

        // 6. Exemplo de uso dos robôs e adaptação de motores de física
        System.out.println("--- Striker Robot ---");
        striker.move();
        striker.kick();
        motorA.move();
        motorA.kick();
        gameMediator.addRobot(striker);

        System.out.println("--- Goalkeeper Robot ---");
        goalkeeper.move();
        goalkeeper.kick();
        motorB.move();
        motorB.kick();
        gameMediator.addRobot(goalkeeper);

        // 7. Exemplo de uso do Visitor Pattern
        System.out.println("--- Applying visitors ---");
        striker.accept(new KickVisitor());
        goalkeeper.accept(new KickVisitor());
    }
}
