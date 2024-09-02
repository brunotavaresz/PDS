package lab06.ex1;

public class Cake {
    private Shape shape;
    private String cakeLayer;
    private int numCakeLayers;
    private Cream midLayerCream;
    private Cream topLayerCream;
    private Topping topping;
    private String message;


    public Shape getShape() {
        return shape;
    }
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public String getCakeLayer() {
        return cakeLayer;
    }
    public void setCakeLayer(String cakeLayer) {
        this.cakeLayer = cakeLayer;
    }
    public int getNumCakeLayers() {
        return numCakeLayers;
    }
    public void setNumCakeLayers(int numCakeLayers) {
        this.numCakeLayers = numCakeLayers;
    }
    public Cream getMidLayerCream() {
        return midLayerCream;
    }
    public void setMidLayerCream(Cream midLayerCream) {
        this.midLayerCream = midLayerCream;
    }
    public Cream getTopLayerCream() {
        return topLayerCream;
    }
    public void setTopLayerCream(Cream topLayerCream) {
        this.topLayerCream = topLayerCream;
    }
    public Topping getTopping() {
        return topping;
    }
    public void setTopping(Topping topping) {
        this.topping = topping;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    

    @Override
    public String toString() {
        String str = (this.getMidLayerCream() != null) ? String.format(" and %s cream", this.getMidLayerCream()) : "";
        return String.format("%s cake with %d layers%s, topped with %s cream and %s. Message says: \"%s\".",
                this.getCakeLayer(), this.getNumCakeLayers(), str, this.getTopLayerCream(), this.getTopping(), this.getMessage());
    }

    
}