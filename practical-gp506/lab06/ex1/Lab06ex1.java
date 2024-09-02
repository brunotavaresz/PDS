package lab06.ex1;

 public class Lab06ex1 {
    public static void main(String[] args) {
        CakeMaster cakeMaster = new CakeMaster();

        CakeBuilder chocolate = new ChocolateCakeBuilder();
        cakeMaster.setCakeBuilder(chocolate);
        cakeMaster.createCake("Congratulations");       // 1 cake layer
        Cake cake = cakeMaster.getCake();
        System.out.println("Your cake is ready: " + cake);
        
        CakeBuilder sponge = new SpongeCakeBuilder();
        cakeMaster.setCakeBuilder(sponge);
        cakeMaster.createCake(Shape.Square, 2, "Well done");    // squared, 2 layers
        cake = cakeMaster.getCake();
        System.out.println("Your cake is ready: " + cake);
        
        CakeBuilder yogurt = new YogurtCakeBuilder();
        cakeMaster.setCakeBuilder(yogurt);
        cakeMaster.createCake(3, "The best");           // 3 cake layers
        cake = cakeMaster.getCake();
        System.out.println("Your cake is ready: " + cake);

        // My cakes
        
        CakeBuilder carrot = new CarrotCakeBuilder();
        cakeMaster.setCakeBuilder(carrot);
        cakeMaster.createCake(Shape.Rectangular, 2, "The best cake");
        cake = cakeMaster.getCake();
        System.out.println("Your cake is ready: " + cake);


        CakeBuilder strawberry = new StrawberryCakeBuilder();
        cakeMaster.setCakeBuilder(strawberry);
        cakeMaster.createCake(1, "Bruunadas cake");
        cake = cakeMaster.getCake();
        System.out.println("Your cake is ready: " + cake);


        CakeBuilder Pascoa = new PascoaCakeBuilder();
        cakeMaster.setCakeBuilder(Pascoa);
        cakeMaster.createCake( "Pascoa cake");
        cake = cakeMaster.getCake();
        System.out.println("Your cake is ready: " + cake);
    }
}
