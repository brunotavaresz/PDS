package lab06.ex1;

public class CarrotCakeBuilder implements CakeBuilder{
    private Cake cake;

    
    public void setCakeShape(Shape shape) {
        cake.setShape(shape);  
    }

    
    public void addCakeLayer() {
        cake.setCakeLayer("Sponge cake");
        cake.setNumCakeLayers(2);
    }

    
    public void addCreamLayer() {
        cake.setMidLayerCream(Cream.Carrot);
    }

    
    public void addTopLayer() {
        cake.setTopLayerCream(Cream.Chocolate);
    }

    
    public void addTopping() {
       cake.setTopping(Topping.Fruit);
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
