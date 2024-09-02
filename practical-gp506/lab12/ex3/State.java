package lab12.ex3;

public interface State {
    void regista(Livro livro);
    void requisita(Livro livro);
    void devolve(Livro livro);
    void reserva(Livro livro);
    void cancelaReserva(Livro livro);
}
