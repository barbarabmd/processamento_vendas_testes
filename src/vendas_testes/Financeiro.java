package vendas_testes;

public class Financeiro {
    private final Banco banco;

    public Financeiro(Banco banco) {
        this.banco = banco;
    }

    public boolean processarPagamento(Pedido pedido) {
        boolean pago = banco.realizarCobranca(pedido.getCliente());
        if (!pago) {
            System.out.println("cliente inadimplente. uma nova cobrança será enviada.");
        }
        return pago;
    }
}
