package vendas_testes;

public class NotaFiscal {

    public NotaFiscal(Pedido pedido) {
    }

    public void enviarParaExpedicao() {
        System.out.println("1a via da nota fiscal enviada para a expedição.");
    }

    public void enviarParaFinanceiro() {
        System.out.println("2a via da nota fiscal enviada para o financeiro.");
    }
}
