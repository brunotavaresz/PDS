package lab06.ex1;

public class ChocolateCakeBuilder implements CakeBuilder{
    private Cake cake;

    
    public void setCakeShape(Shape shape) {
        cake.setShape(Shape.Circular);  
    }

    
    public void addCakeLayer() {
        cake.setCakeLayer("Soft Chocolate");
        cake.setNumCakeLayers(1);
    }

    
    public void addCreamLayer() {
        cake.setMidLayerCream(null);
    }

    
    public void addTopLayer() {
        cake.setTopLayerCream(Cream.Whipped_Cream);
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
