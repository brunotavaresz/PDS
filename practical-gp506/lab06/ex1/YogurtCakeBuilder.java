package lab06.ex1;

public class YogurtCakeBuilder implements CakeBuilder{
    private Cake cake;

    
    public void setCakeShape(Shape shape) {
        cake.setShape(Shape.Circular);  
    }

    
    public void addCakeLayer() {
        cake.setCakeLayer("Yogurt Cake");
        cake.setNumCakeLayers(3);
    }

    
    public void addCreamLayer() {
        cake.setMidLayerCream(Cream.Vanilla);
    }

    
    public void addTopLayer() {
        cake.setTopLayerCream(Cream.Red_Berries);
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
