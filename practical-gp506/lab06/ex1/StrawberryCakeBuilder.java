package lab06.ex1;

public class StrawberryCakeBuilder implements CakeBuilder{
    private Cake cake;

    public void setCakeShape(Shape shape){
        this.cake.setShape(Shape.Circular);
    }
    
    
    public void addCakeLayer() {
        cake.setCakeLayer("Sponge cake");
        cake.setNumCakeLayers(1);
    }

    
    public void addCreamLayer() {
        cake.setMidLayerCream(null);
    }

    public void addTopLayer() {
        cake.setTopLayerCream(Cream.Red_Berries);
    }

    
    public void addTopping() {
       cake.setTopping(Topping.Strawberry);
    }

    
    public void addMessage(String m) {
        cake.setMessage(m);;
    }
    
    public Cake getCake() {
        return cake;
    }

    public void createCake(){
        cake = new Cake();
    }


}
