package lab11.ex1;


public class Produto {
    private static int contadorCodigo = 0;
    private int codigo;
    private String descricao;
    private double precoBase;
    private double maiorOferta;
    private String estado;
    private Leilao leilao;
    private Client maiorLicitador;

    public Produto(String descricao, double precoBase, Leilao leilao) {
        this.codigo = ++contadorCodigo;
        this.descricao = descricao;
        this.precoBase = precoBase;
        this.maiorOferta = precoBase;
        this.estado = "stock";
        this.leilao = leilao;
        this.maiorLicitador = null;
    }

    public void iniciarLeilao(long tempoLeilao) {
        if (estado.equals("stock")) {
            estado = "leilão";
            leilao.notificarGestores("Leilão iniciado para o produto: " + descricao);
            new Thread(() -> {
                try {
                    Thread.sleep(tempoLeilao);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finalizarLeilao();
            }).start();
        }
    }

    public void licitar(Client cliente, double valor) {
        if (estado.equals("leilão") && valor > maiorOferta) {
            maiorOferta = valor;
            maiorLicitador = cliente;
            leilao.notificarClientes(this, "Nova oferta de " + valor + " para o produto " + descricao);
            leilao.notificarGestores("Nova oferta de " + valor + " para o produto " + descricao + " por " + cliente.getNome());
        }
    }

    public void finalizarLeilao() {
        if (estado.equals("leilão")) {
            if (maiorLicitador != null) {
                estado = "vendas";
                leilao.notificarClientes(this, "Leilão terminado. Produto " + descricao + " vendido para " + maiorLicitador.getNome() + " por " + maiorOferta);
                leilao.notificarGestores("Produto " + descricao + " vendido para " + maiorLicitador.getNome() + " por " + maiorOferta);
            } else {
                estado = "stock";
                leilao.notificarGestores("Leilão terminado sem ofertas para o produto " + descricao);
            }
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public double getMaiorOferta() {
        return maiorOferta;
    }

    public String getEstado() {
        return estado;
    }
}
