package adapter.Lion;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Lion
        Lion lion = new Lion();

        // Adaptando o Lion para a interface Animal
        Animal adaptedLion = new LionAdapter(lion);

        // Usando o adaptador para chamar o método makeSound()
        adaptedLion.makeSound();  // Deve imprimir "Roar!"
    }

    static class Lion {
        public void roar() {
            System.out.println("Roar");
        }
    }

    interface Animal {
        void makeSound();
    }

    static class LionAdapter implements Animal {
        private Lion lion;

        LionAdapter(Lion lion) {
            this.lion = lion;
        }

        public void makeSound() {
            lion.roar();
        }
    }
}
