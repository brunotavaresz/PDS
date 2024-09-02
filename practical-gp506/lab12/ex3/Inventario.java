package lab12.ex3;

public class Inventario implements State{
    @Override
    public void regista(Livro livro) {
        livro.setState(new Disponivel());
    }

    @Override
    public void requisita(Livro livro) {
        System.out.println("Livro não pode ser requisitado.");
    }

    @Override
    public void devolve(Livro livro) {
        System.out.println("Livro não pode ser devolvido.");
    }

    @Override
    public void reserva(Livro livro) {
        System.out.println("Livro não pode ser reservado.");
    }

    @Override
    public void cancelaReserva(Livro livro) {
        System.out.println("Livro não pode ter a reserva cancelada.");
    }

    @Override
    public String toString(){
        return "Inventario";
    }

}
