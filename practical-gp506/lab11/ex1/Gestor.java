package lab11.ex1;

import java.util.ArrayList;

public class Gestor implements Observer {
    private String nome;

    public Gestor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String message) {
        System.out.println("Gestor " + nome + ": " + message);
    }
}


    

