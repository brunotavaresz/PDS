package lab5_1;

import java.util.ArrayList;
import java.util.List;

public class Rental {
    private String nome;
    private String codigoPostal;
    private String email;
    private List<Vehicle> veiculos = new ArrayList<>();

    public Rental(String nome, String codigoPostal, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public List<Vehicle> getVeiculosList() {
        return veiculos;
    }

    public void addVeiculo(Vehicle veiculo) {
        this.veiculos.add(veiculo);
    }

    public Vehicle getVeiculo(String matricula) {
        for (Vehicle veiculo : veiculos) {
            if (veiculo.getMatricula() == matricula) {
                return veiculo;
            }
        }

        return null;
    }

    public List<Vehicle> getStock() {
        return veiculos;
    }

}
