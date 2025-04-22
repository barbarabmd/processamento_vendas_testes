package vendas_testes;

public class ProcessadorPedido {
    private final AvaliadorCredito avaliadorCredito = new AvaliadorCredito();
    private final Expedicao expedicao = new Expedicao();
    private final Financeiro financeiro = new Financeiro(new Banco());

    public void processar(Pedido pedido) {
        if (!avaliadorCredito.aprovarCredito(pedido.getCliente())) {
            System.out.println("credito reprovado.");
            pedido.cancelar();
            return;
        }

        NotaFiscal nf = new NotaFiscal(pedido);
        nf.enviarParaExpedicao();
        nf.enviarParaFinanceiro();

        expedicao.separarPedido(pedido);

        boolean pago = financeiro.processarPagamento(pedido);
        if (pago) {
            pedido.finalizar();
        } else {
            pedido.cancelar();
        }
    }
}
