package lab5_1;

public class Vehicle {
    private String matricula;
    private String marca;
    private String modelo;
    private int cilindrada;
    private int kmstotal = 0;
	private int kmstemp = 0;

    public Vehicle(String matricula, String marca, String modelo, int cilindrada) {
        if(isMatriculaValida(matricula)) {
            this.matricula = matricula;
        }
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    


    public String toString() {
        return "Matrícula: " + this.getMatricula() + " Marca: " + this.getMarca() + " Modelo: " +this.getModelo() + " Cilindrada: " + this.getCilindrada() + " \n";
    }

    public boolean isMatriculaValida(String matricula) {
        if (matricula.length() != 8 || matricula.charAt(2) != '-' || matricula.charAt(5) != '-') {
            return false;
        }

        int numeros = 0, letras = 0;
 
        for (int contador = 0; contador < matricula.length(); contador++) {
            if (Character.isLetter(matricula.charAt(contador))) {
                if (matricula.charAt(contador) == (matricula.toUpperCase().charAt(contador))) {
                    ++letras;
                    continue;
                }
            }

            if (Character.isDigit(matricula.charAt(contador))) {
                ++numeros;
            }
 
            if (contador == 2) {
                if (numeros != 2 && letras != 2) {
                    return false;
                }
            }

            if (contador == 4) {
                if ((numeros != 2 || letras != 2) && (numeros != 4)) {
                    return false;
                }
            }
 
        }

        if (numeros == 4 && letras == 2) {
            return true;
        }
        return false;
    }


}

