package lab5_1;

public class PesadosPassageirosEletrico extends PesadoPassageiros implements EletricVehicle {
    private int autonomia;
    private int carga;

    public PesadosPassageirosEletrico(String matricula, String marca, String modelo, int cilindrada, String numQuadro, double peso, double  numPassageiros, int carga, int autonomia) {
        super(matricula, marca, modelo, cilindrada, numQuadro, peso, numPassageiros);
        this.autonomia = autonomia;
        this.carga = carga;
    }

    public int autonomia() {
        return this.autonomia;
    }

    public void carregar(int percentagem) {
        this.carga += percentagem;
    }
}
