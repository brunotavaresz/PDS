package lab06.ex1;

public class PascoaCakeBuilder implements CakeBuilder{
    private Cake cake;

    public void setCakeShape(Shape shape){
        this.cake.setShape(shape);
    }
    
    
    public void addCakeLayer() {
        cake.setCakeLayer("Yogurt cake");
        cake.setNumCakeLayers(1);
    }

    
    public void addCreamLayer() {
        cake.setMidLayerCream(null);
    }

    public void addTopLayer() {
        cake.setTopLayerCream(Cream.Fruit);
    }

    
    public void addTopping() {
       cake.setTopping(Topping.Chocolate);
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
