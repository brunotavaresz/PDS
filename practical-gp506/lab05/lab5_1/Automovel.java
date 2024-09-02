package lab5_1;


public class Automovel extends Vehicle {
    private String nrquadro;
    private int bagageira;

    public Automovel(String matricula, String marca, String modelo, int cilindrada, String nrquadro, int bagageira) {
        super(matricula, marca, modelo, cilindrada);
        this.nrquadro = nrquadro;
        this.bagageira = bagageira;
    }

    public String getNrQuadro() {
        return nrquadro;
    }

    public int getBagageira() {
        return bagageira;
    }
    
}