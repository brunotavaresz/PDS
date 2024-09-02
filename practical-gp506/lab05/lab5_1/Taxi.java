package lab5_1;

public class Taxi extends Automovel {
    private String nrlicenca;

    public Taxi(String matricula, String marca, String modelo, int cilindrada, String numQuadro, int capBagageira, String nrlicenca) {
        super(matricula, marca, modelo, cilindrada, numQuadro, capBagageira);
        this.nrlicenca = nrlicenca;
    }

    public String getNumLicenca() {
        return nrlicenca;
    }

    
}