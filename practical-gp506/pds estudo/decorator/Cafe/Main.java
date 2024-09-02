package decorator.Cafe;

public class Main {
    public static void main(String[] args) {
        Cafe expresso = new Expresso();
        System.out.println("Café expresso");
        System.out.println("Descrição: " + expresso.descricao());
        System.out.println("Custo: €" + expresso.custo());

        Cafe leite = new LeiteDecorator(expresso);
        System.out.println("Café expresso com leite");
        System.out.println("Descrição: " + leite.descricao());
        System.out.println("Custo: €" + leite.custo());

        Cafe acucar = new AcucarDecorator(expresso);
        System.out.println("Café expresso com açúcar");
        System.out.println("Descrição: " + acucar.descricao());
        System.out.println("Custo: €" + acucar.custo());

        Cafe acucarleite = new AcucarDecorator(new LeiteDecorator(expresso));
        System.out.println("Café expresso com leite e açúcar");
        System.out.println("Descrição: " + acucarleite.descricao());
        System.out.println("Custo: €" + acucarleite.custo());
    }

    interface Cafe {
        String descricao();
        Double custo();
    }

    static class CafeDecorator implements Cafe {
        protected Cafe cafe;

        public CafeDecorator(Cafe cafe) {
            this.cafe = cafe;
        }

        public Double custo() {
            return cafe.custo();
        }

        public String descricao() {
            return cafe.descricao();
        }
    }

    static class Expresso implements Cafe {
        @Override
        public Double custo() {
            return 2.0;
        }

        @Override
        public String descricao() {
            return "expresso";
        }
    }

    static class LeiteDecorator extends CafeDecorator {
        public LeiteDecorator(Cafe cafe) {
            super(cafe);
        }

        @Override
        public Double custo() {
            return super.custo() + 0.50;
        }

        @Override
        public String descricao() {
            return super.descricao() + ", com leite";
        }
    }

    static class AcucarDecorator extends CafeDecorator {
        public AcucarDecorator(Cafe cafe) {
            super(cafe);
        }

        @Override
        public Double custo() {
            return super.custo() + 0.75;
        }

        @Override
        public String descricao() {
            return super.descricao() + ", com açúcar";
        }
    }
}
