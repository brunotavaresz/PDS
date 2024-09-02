package lab5_1;

public class VehicleFactory {
    public static Motociclo createMotociclo(String matricula, String marca, String modelo, int cilindrada, String tipo) {
        return new Motociclo(matricula, marca, modelo, cilindrada, tipo);
    }

    public static Automovel createAutomovelLigeiro(String matricula, String marca, String modelo, int cilindrada, String nrquadro, int bagageira) {
        return new Automovel(matricula, marca, modelo, cilindrada, nrquadro, bagageira);
    }

    public static Taxi createTaxi(String matricula, String marca, String modelo, int cilindrada, String numQuadro, int capBagageira, String nrlicenca) {
        return new Taxi(matricula, marca, modelo, cilindrada, numQuadro, capBagageira, nrlicenca);
    }

    public static PesadoPassageiros createPesadoPassageiros(String matricula, String marca, String modelo, int cilindrada, String numQuadro, double peso, double numPassageiros) {
        return new PesadoPassageiros(matricula, marca, modelo, cilindrada, numQuadro, peso, numPassageiros);
    }

    public static PesadoMercadorias createPesadoMercadorias(String matricula, String marca, String modelo, int cilindrada, String nrquadro, double peso, double cargaMaxima) {
        return new PesadoMercadorias(matricula, marca, modelo, cilindrada, nrquadro, peso, cargaMaxima);
    }

    public static AutomovelEletrico createALEletrico(String matricula, String marca, String modelo, int cilindrada, String nrquadro, int capBagageira, int capBateria, int autonomia) {
        return new AutomovelEletrico(matricula, marca, modelo, cilindrada, nrquadro, capBagageira, capBateria, autonomia);
    }

    public static PesadosPassageirosEletrico createPPEletrico(String matricula, String marca, String modelo, int cilindrada, double peso, String numQuadro,  double numPassageiros, int carga, int autonomia) {
        return new PesadosPassageirosEletrico(matricula, marca, modelo, cilindrada, numQuadro, peso, numPassageiros, carga, autonomia);
    }
}
