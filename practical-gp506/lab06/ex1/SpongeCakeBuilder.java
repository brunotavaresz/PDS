package lab06.ex1;

public class SpongeCakeBuilder  implements CakeBuilder{
    private Cake cake;

    
    public void setCakeShape(Shape shape) {
        cake.setShape(shape);  
    }

    
    public void addCakeLayer() {
        cake.setCakeLayer("Sponge");
        cake.setNumCakeLayers(2);
    }

    
    public void addCreamLayer() {
        cake.setMidLayerCream(Cream.Red_Berries);
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
