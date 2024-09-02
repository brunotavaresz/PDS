package lab5_1;

public class PesadoPassageiros extends Vehicle {
    private String numQuadro;
    private double peso;
    private double numPassageiros;

    public PesadoPassageiros(String matricula, String marca, String modelo, int cilindrada, String numQuadro, double peso, double numPassageiros) {
        super(matricula, marca, modelo, cilindrada);
        this.numQuadro = numQuadro;
        this.peso = peso;
        this.numPassageiros = numPassageiros;
    }

    public String getNumQuadro() {
        return numQuadro;
    }

    public double getPeso() {
        return peso;
    }

    public double getNumPassageiros() {
        return numPassageiros;
    }

}
