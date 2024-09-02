package lab5_2;

public class Tupperware extends Container {
    public Tupperware(Portion portion) {
        super(portion);
    }

    @Override
    public String toString() {
        return "Tupperware with portion = " + getPortion();
    }
}
