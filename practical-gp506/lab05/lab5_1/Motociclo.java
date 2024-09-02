package lab5_1;

public class Motociclo extends Vehicle {
    private String tipo;

    public Motociclo(String matricula, String marca, String modelo, int cilindrada, String tipo) {
        super(matricula, marca, modelo, cilindrada);
        if (!tipo.equals("desportivo") && !tipo.equals("estrada"))
            throw new IllegalArgumentException("tipo inválido");
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}