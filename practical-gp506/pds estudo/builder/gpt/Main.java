package builder.gpt;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();
        
        Pizza pizza1 = director.buildPepperoniPizza();
        System.out.println(pizza1);
        
        Pizza pizza2 = director.buildVeggiePizza();
        System.out.println(pizza2);
    }

    static class PizzaDirector {
        private PizzaBuilder builder = new PizzaBuilder();

        public Pizza buildPepperoniPizza() {
            return builder.setTamanho("grande").setMassa("fina").setQueijo("mozzarela").setTopping("tomate").build();
        }

        public Pizza buildVeggiePizza() {
            return builder.setTamanho("pequena").setMassa("grossa").setQueijo("sem").setTopping("nada").build();
        }
    }

    static class PizzaBuilder {
        private String tamanho;
        private String massa;
        private String queijo;
        private String topping;
            
        public PizzaBuilder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public PizzaBuilder setTamanho(String tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        public PizzaBuilder setMassa(String massa) {
            this.massa = massa;
            return this;
        }

        public PizzaBuilder setQueijo(String queijo) {
            this.queijo = queijo;
            return this;
        }

        public Pizza build() {
            return new Pizza(tamanho, massa, queijo, topping);
        }
    }

    static class Pizza {
        private String tamanho;
        private String massa;
        private String queijo;
        private String topping;
    
        public Pizza(String tamanho, String massa, String queijo, String topping)  {
            this.tamanho = tamanho;
            this.massa = massa;
            this.queijo = queijo;
            this.topping = topping;
        }

        public String getTamanho() {
            return this.tamanho;
        }
    
        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }
    
        public String getMassa() {
            return this.massa;
        }
    
        public void setMassa(String massa) {
            this.massa = massa;
        }
    
        public String getQueijo() {
            return this.queijo;
        }
    
        public void setQueijo(String queijo) {
            this.queijo = queijo;
        }
    
        public String getTopping() {
            return this.topping;
        }
    
        public void setTopping(String topping) {
            this.topping = topping;
        }

        @Override
        public String toString() {
            return "Pizza [tamanho=" + tamanho + ", massa=" + massa + ", queijo=" + queijo + ", topping=" + topping + "]";
        }
    }

}


