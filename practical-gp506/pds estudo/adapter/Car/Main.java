package adapter.Car;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Car
        Car car = new Car();

        // Adaptando o Car para a interface Vehicle
        Vehicle adaptedCar = new CarAdapter(car);

        // Usando o adaptador para chamar o método move()
        adaptedCar.move();  // Deve imprimir "The car is driving"
    }

    static class Car {

        public void drive(){
            System.out.println("The car is driving");
        }
    }

    interface Vehicle {
        void move();
    }

    static class CarAdapter implements Vehicle{
        private Car car;

        CarAdapter(Car car){
            this.car = car;
        }

        public void move() {
            car.drive();
        }
    }
}
