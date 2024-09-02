package lab12.ex3;

public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private String isbn;
    private State estado;

    public Livro(String titulo, String autor, String ano, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        this.estado = new Inventario();
    }

    public void setState(State state){
    this.estado = state;
    }

    public State getState(){
        return this.estado;
    }

    @Override
    public String toString(){
        return String.format("%-35s %-25s %-25s %-25s [%s]",  this.titulo, this.autor, this.ano, this.isbn, this.estado);
    }

    
}
