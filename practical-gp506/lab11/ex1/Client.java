package lab11.ex1;

import java.util.ArrayList;
import java.util.List;

public class Client implements Observer {
    private String nome;
    private List<Produto> produtosInteressados;

    public Client(String nome) {
        this.nome = nome;
        this.produtosInteressados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void licitar(Produto produto, double valor) {
        produto.licitar(this, valor);
        if (!produtosInteressados.contains(produto)) {
            produtosInteressados.add(produto);
        }
    }

    @Override
    public void update(String message) {
        System.out.println("Cliente " + nome + ": " + message);
    }
}

