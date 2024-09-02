package lab12.ex3;

public class Disponivel implements State {
    @Override
    public void regista(Livro livro) {
        System.out.println("Livro já se encontra registado.");
    }

    @Override
    public void requisita(Livro livro) {
        livro.setState(new Emprestado());
    }

    @Override
    public void devolve(Livro livro) {
        System.out.println("Livro não pode ser devolvido.");
    }

    @Override
    public void reserva(Livro livro) {
        livro.setState(new Reservado());
    }

    @Override
    public void cancelaReserva(Livro livro) {
        System.out.println("Livro não pode ter a reserva cancelada.");
    }

    @Override
    public String toString(){
        return "Disponivel";
    }
}
