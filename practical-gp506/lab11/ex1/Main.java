package lab11.ex1;

public class Main {
    public static void main(String[] args) {
        Leilao leilao = new Leilao();

        Gestor gestor = new Gestor("Gestor1");
        leilao.adicionarGestor(gestor);

        Produto produto1 = new Produto("Computador", 1000.0, leilao);
        Produto produto2 = new Produto("Smartphone", 500.0, leilao);
        Produto produto3 = new Produto("Fiat Panda", 300.0, leilao);
        Produto produto4 = new Produto("Smartwatch", 200.0, leilao);
        Produto produto5 = new Produto("Opel Corsa", 700.0, leilao);

        leilao.adicionarProduto(produto1);
        leilao.adicionarProduto(produto2);
        leilao.adicionarProduto(produto3);
        leilao.adicionarProduto(produto4);
        leilao.adicionarProduto(produto5);

        System.out.println("\nProdutos em stock:");
        for (Produto p : leilao.getProdutosEmStock()) {
            System.out.println(p.getDescricao());
        }


        Client cliente1 = new Client("Vasco");
        Client cliente2 = new Client("Bruno");
        Client cliente3 = new Client("Cris");

        leilao.adicionarCliente(cliente1);
        leilao.adicionarCliente(cliente2);
        leilao.adicionarCliente(cliente3);

        produto1.iniciarLeilao(10000);
        produto2.iniciarLeilao(15000); 

        System.out.println("\nProdutos em leilão:");
        for (Produto p : leilao.getProdutosEmLeilao()) {
            System.out.println(p.getDescricao());
        }

        cliente1.licitar(produto1, 1200.0);
        cliente2.licitar(produto1, 1300.0);
        cliente3.licitar(produto2, 550.0);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nProdutos vendidos:");
        for (Produto p : leilao.getProdutosVendidos()) {
            System.out.println(p.getDescricao());
        }

        System.out.println("\nProdutos em stock:");
        for (Produto p : leilao.getProdutosEmStock()) {
            System.out.println(p.getDescricao());
        }

    }
}

