package lab5_1;

public class AutomovelEletrico extends Automovel implements EletricVehicle{
    private int carga;
    private int autonomia;

    public AutomovelEletrico(String matricula, String marca, String modelo, int cilindrada, String nrquadro, int bagageira, int carga, int autonomia) {
        super(matricula, marca, modelo, cilindrada, nrquadro, bagageira);
        this.carga = carga;
        this.autonomia = autonomia;
    }

    public int getCarga() {
        return carga;
    }

    public int getAutonomia() {
        return autonomia;
    }

    @Override
    public int autonomia() {

        return autonomia;}

    @Override
    public void carregar(int percentagem) {
        carga += percentagem;}
}
