package lab5_2;

public abstract class Container {
    private final Portion portion;

    public Container(Portion portion) {
        this.portion = portion;
    }

    protected Portion getPortion() {
        return portion;
    }

    public abstract String toString();

    public static Container create(Portion portion) {
        if (portion.getState() == State.Liquid && portion.getTemperature() == Temperature.COLD) {
            return new PlasticBottle(portion);
        } else if (portion.getState() == State.Solid && portion.getTemperature() == Temperature.COLD) {
            return new PlasticBag(portion);
        } else if (portion.getState() == State.Liquid && portion.getTemperature() == Temperature.WARM) {
            return new TermicBottle(portion);
        } else if (portion.getState() == State.Solid && portion.getTemperature() == Temperature.WARM) {
            return new Tupperware(portion);
        }
        return null;
    }
}

