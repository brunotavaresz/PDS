package factory.ex_factoryChat;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculo fabrica = new FabricaVeiculo();

        Veiculo meuCarro = fabrica.criarVeiculo("carro");
        Veiculo minhaMoto = fabrica.criarVeiculo("moto");

        if (meuCarro != null) {
            meuCarro.exibirInformacoes();
        } else {
            System.out.println("Tipo de veículo inválido.");
        }

        if (minhaMoto != null) {
            minhaMoto.exibirInformacoes();
        } else {
            System.out.println("Tipo de veículo inválido.");
        }
    }

    interface Veiculo {
        void exibirInformacoes();
    }

    static class FabricaVeiculo {

        public Veiculo criarVeiculo(String type) {

            if (type.equals("carro")) {
                return new Carro();
            } else if (type.equals("moto")) {
                return new Moto();
            } else {
                return null;
            }
        }

    }

    static class Carro implements Veiculo {
        
        public Carro() {

        }

        public void exibirInformacoes() {
            System.out.println("CARROOOO");
        }
        
    }

    static class Moto implements Veiculo {

        public Moto() {

        }

        public void exibirInformacoes() {
            System.out.println("MOTOOOO");
        }
    }
}
