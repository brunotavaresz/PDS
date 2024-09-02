package lab12.ex3;

public class Emprestado implements State{
    @Override
    public void regista(Livro livro) {
        System.out.println("Livro já registado.");
    }

    @Override
    public void requisita(Livro livro) {
        System.out.println("Livro já requisitado.");
    }

    @Override
    public void devolve(Livro livro) {
        livro.setState(new Disponivel());
    }

    @Override
    public void reserva(Livro livro) {
        System.out.println("Livro já requisitado.");
    }

    @Override
    public void cancelaReserva(Livro livro) {
        System.out.println("Livro já requisitado.");
    }

    @Override
    public String toString(){
        return "Emprestado";
    }
}
