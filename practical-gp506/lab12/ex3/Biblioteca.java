package lab12.ex3;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    public void requisitarLivro(Livro livro) {
        livro.getState().requisita(livro);
    }

    public void devolverLivro(Livro livro) {
        livro.getState().devolve(livro);
    }

    public void reservarLivro(Livro livro) {
        livro.getState().reserva(livro);
    }

    public void cancelarReservaLivro(Livro livro) {
        livro.getState().cancelaReserva(livro);
    }

    public void registarLivro(Livro livro) {
        livro.getState().regista(livro);
    }  
    
}
