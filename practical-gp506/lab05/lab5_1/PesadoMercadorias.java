package lab5_1;

public class PesadoMercadorias  extends Vehicle {
    private String nrquadro;
    private double peso;
    private double cargaMaxima;

    public PesadoMercadorias(String matricula, String marca, String modelo, int cilindrada, String nrquadro, double peso, double cargaMaxima) {
        super(matricula, marca, modelo, cilindrada);
        this.nrquadro = nrquadro;
        this.peso = peso;
        this.cargaMaxima = cargaMaxima;
    }

    public String getNumQuadro() {
        return nrquadro;
    }

    public double getPeso() {
        return peso;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

}