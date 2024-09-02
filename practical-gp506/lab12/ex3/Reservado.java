package lab12.ex3;

public class Reservado implements State{
    @Override
    public void regista(Livro livro) {
        System.out.println("Livro já registado.");
    }

    @Override
    public void requisita(Livro livro) {
        System.out.println("Livro já reservado.");
    }

    @Override
    public void devolve(Livro livro) {
        System.out.println("Livro reservado.");
    }

    @Override
    public void reserva(Livro livro) {
        System.out.println("Livro já reservado.");
    }

    @Override
    public void cancelaReserva(Livro livro) {
        livro.setState(new Disponivel());
    }

    @Override
    public String toString(){
        return "Reservado";
    }
    
}
