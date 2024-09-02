package builder.aula;

public class Main {
    public static void main(String[] args) {
        Waiter emp1 = new Waiter();

        Pizza p1 = emp1.constructPizza("HawaiianPizza", Tipo.Circulo, "Thin", "Tomato", "Pineapple");
        System.out.println(p1.showPizza());

        Pizza p2 = emp1.constructPizza("MargheritaPizza", Tipo.Quadrado, "Thick", "Tomato", "Cheese");
        System.out.println(p2.showPizza());

    }

    static class Waiter {
        private PizzaBuilder pizzaBuilder;

        public Waiter() {
            this.pizzaBuilder = new PizzaBuilder();
        }

        public Pizza constructPizza(String name, Tipo tipo, String dough, String sauce, String topping) {
            return pizzaBuilder.addName(name).addTipo(tipo).addDough(dough).addSauce(sauce).addTopping(topping).build();
        }
    }

    static class PizzaBuilder {
        private Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder addName(String s) {
            this.pizza.setName(s);
            return this;
        }

        public PizzaBuilder addTipo(Tipo t){
            this.pizza.setTipo(t);
            return this;
        }
    
        public PizzaBuilder addDough(String s){
            this.pizza.setDough(s);
            return this;
        }
    
        public PizzaBuilder addSauce(String s){
            this.pizza.setSauce(s);
            return this;
        }
    
        public PizzaBuilder addTopping(String s){
            this.pizza.setTopping(s);
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }

    enum Tipo {
        Circulo, Quadrado, Retangulo
    }

    static class Pizza {
        private String name;
        private Tipo tipo;
        private String dough;
        private String sauce;
        private String topping;

        Pizza(){
        }
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
        public Tipo getTipo() {
            return tipo;
        }
    
        public void setTipo(Tipo tipo) {
            this.tipo = tipo;
        }
    
        public String getDough() {
            return dough;
        }
    
        public void setDough(String dough) {
            this.dough = dough;
        }
    
        public String getSauce() {
            return sauce;
        }
    
        public void setSauce(String sauce) {
            this.sauce = sauce;
        }
    
        public String getTopping() {
            return topping;
        }
    
        public void setTopping(String topping) {
            this.topping = topping;
        }
    
        public String showPizza() {
            return "Pizza with name=" + name + "e tipo=" + tipo + ", com dough=" + dough + ", sauce=" + sauce + ", topping="
                    + topping;
        }
    }


}

