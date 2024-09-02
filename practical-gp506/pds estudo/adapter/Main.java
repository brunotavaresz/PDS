package adapter;

// Interface Temperature
interface Temperature {
    double getTemperature();
}

// Classe TemperatureInCelsius
class TemperatureInCelsius {
    private double temperatureInCelsius;

    public TemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }
}

// Classe TemperatureAdapter
class TemperatureAdapter implements Temperature {
    private TemperatureInCelsius temperatureInCelsius;

    public TemperatureAdapter(TemperatureInCelsius temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    @Override
    public double getTemperature() {
        // Converte a temperatura de Celsius para Fahrenheit
        return (temperatureInCelsius.getTemperatureInCelsius() * 9/5) + 32;
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        TemperatureInCelsius tempInCelsius = new TemperatureInCelsius(25);
        Temperature tempInFahrenheit = new TemperatureAdapter(tempInCelsius);

        System.out.println("Temperature in Celsius: " + tempInCelsius.getTemperatureInCelsius());
        System.out.println("Temperature in Fahrenheit: " + tempInFahrenheit.getTemperature());
    }
}
