package lab12.ex1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Telemovel t1 = new Telemovel("Samsung Galaxy S21", "Exynos 2100", 1049.99, 8, 108);
        Telemovel t2 = new Telemovel("Apple iPhone 12", "A14 Bionic", 1179.99, 4, 12);
        Telemovel t3 = new Telemovel("Xiaomi Mi 11", "Snapdragon 888", 799.99, 8, 108);
        Telemovel t4 = new Telemovel("OnePlus 9 Pro", "Snapdragon 888", 919.99, 8, 48);
        Telemovel t5 = new Telemovel("Samsung Galaxy S21 Ultra", "Exynos 2100", 1399.99, 12, 108);
        Telemovel t6 = new Telemovel("Apple iPhone 12 Pro", "A14 Bionic", 1179.99, 6, 12);

        ArrayList<Telemovel> telemoveis1 = new ArrayList<>();
        telemoveis1.add(t1);
        telemoveis1.add(t2);
        telemoveis1.add(t3);
        ArrayList<Telemovel> telemoveis2 = new ArrayList<>();
        telemoveis2.add(t4);
        telemoveis2.add(t5);
        telemoveis2.add(t6);
        ArrayList<Telemovel> telemoveis3 = new ArrayList<>();
        telemoveis3.add(t2);
        telemoveis3.add(t4);
        telemoveis3.add(t6);


        Revista r1 = new Revista(new BubbleSort(), telemoveis1);
        Revista r2 = new Revista(new InsertionSort(), telemoveis2);
        Revista r3 = new Revista(new QuickSort(), telemoveis3);

        System.out.println("------------------BubbleSort----------------------");
        System.out.println("Nome: ");
        r1.sort("nome");
        for (Telemovel tel : telemoveis1)
            System.out.println(tel);
        System.out.println("\n");
        System.out.println("Preço: ");
        r1.sort("preco");
        for (Telemovel tel : telemoveis1)
            System.out.println(tel);
        System.out.println("\n");
        System.out.println("Processador: ");
        r1.sort("processador");
        for (Telemovel tel : telemoveis1)
            System.out.println(tel);
        System.out.println("\n");
        System.out.println("Memoria: ");
        r1.sort("memoria");
        for (Telemovel tel : telemoveis1)
            System.out.println(tel);
        System.out.println("\n");
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------InsertionSort-----------------------------");
        System.out.println("Nome: ");
        r2.sort("nome");
        for (Telemovel tel : telemoveis2)
            System.out.println(tel);
        System.out.println("Preco: ");
        r2.sort("preco");
        for (Telemovel tel : telemoveis2)
            System.out.println(tel);
        System.out.println("Processador: ");
        r2.sort("processador");
        for (Telemovel tel : telemoveis2)
            System.out.println(tel);
        System.out.println("Memoria: ");
        r2.sort("memoria");
        for (Telemovel tel : telemoveis2)
            System.out.println(tel);
        System.out.println("\n");
        System.out.println("----------------------------------------------------------");

        System.out.println("----------------------QuickSort---------------------------");
        System.out.println("Nome: ");
        r3.sort("nome");
        for (Telemovel tel : telemoveis3)
            System.out.println(tel);
        System.out.println("\n");
        System.out.println("Preço: ");
        r3.sort("preco");
        for (Telemovel tel : telemoveis3)
            System.out.println(tel);
            System.out.println("\n");
        System.out.println("Processador: ");
        r3.sort("processador");
        for (Telemovel tel : telemoveis3)
            System.out.println(tel);
            System.out.println("\n");
        System.out.println("Memoria: ");
        r3.sort("memoria");
        for (Telemovel tel : telemoveis3)
            System.out.println(tel);
        System.out.println("----------------------------------------------------------");
    }
}
