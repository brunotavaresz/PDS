package lab06.ex1;

public class CakeMaster {
    private CakeBuilder builder;

    public void setCakeBuilder(CakeBuilder builder){
        this.builder = builder;
    }

    public void createCake(String name){
        builder.createCake();
        builder.setCakeShape(Shape.Circular);
        builder.addCakeLayer();
        builder.addCreamLayer();
        builder.addTopLayer();
        builder.addTopping();
        builder.addMessage(name);
    }

    public void createCake(int numCakeLayers, String m) {
        builder.createCake();
        builder.setCakeShape(Shape.Circular);
        for (int i = 0; i < numCakeLayers; i++) {
            builder.addCakeLayer();
            builder.addCreamLayer();
        }
        builder.addTopLayer();
        builder.addTopping();
        builder.addMessage(m);        
    }

    public void createCake(Shape shape, int numCakeLayers, String m) {
        builder.createCake();
        builder.setCakeShape(shape);
        for (int i = 0; i < numCakeLayers; i++) {
            builder.addCakeLayer();
            builder.addCreamLayer();
        }
        builder.addTopLayer();
        builder.addTopping();
        builder.addMessage(m);       }

    public Cake getCake(){
        return builder.getCake();
    }
}
