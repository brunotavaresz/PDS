package lab11.ex1;
import java.util.ArrayList;
import java.util.List;

public class Leilao {
    private List<Produto> produtos;
    private List<Client> clientes;
    private List<Gestor> gestores;

    public Leilao() {
        produtos = new ArrayList<>();
        clientes = new ArrayList<>();
        gestores = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarCliente(Client cliente) {
        clientes.add(cliente);
    }

    public void adicionarGestor(Gestor gestor) {
        gestores.add(gestor);
    }

    public void notificarClientes(Produto produto, String mensagem) {
        for (Client cliente : clientes) {
            if (produto == null || produto.getEstado().equals("leilão")) {
                cliente.update(mensagem);
            }
        }
    }

    public void notificarGestores(String mensagem) {
        for (Gestor gestor : gestores) {
            gestor.update(mensagem);
        }
    }

    public List<Produto> getProdutosEmStock() {
        List<Produto> emStock = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getEstado().equals("stock")) {
                emStock.add(produto);
            }
        }
        return emStock;
    }

    public List<Produto> getProdutosEmLeilao() {
        List<Produto> emLeilao = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getEstado().equals("leilão")) {
                emLeilao.add(produto);
            }
        }
        return emLeilao;
    }

    public List<Produto> getProdutosVendidos() {
        List<Produto> vendidos = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getEstado().equals("vendas")) {
                vendidos.add(produto);
            }
        }
        return vendidos;
    }
}
