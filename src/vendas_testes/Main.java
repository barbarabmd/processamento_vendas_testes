package vendas_testes;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados();
        Cliente cliente = bd.obterRandomCliente();
        Pedido pedido = new Pedido(cliente);

        ProcessadorPedido processador = new ProcessadorPedido();
        processador.processar(pedido);

        if (pedido.isFinalizado()) {
            System.out.println("pedido finalizado com sucesso!" + cliente.getNome());
        } else if (pedido.isCancelado()) {
            System.out.println("pedido cancelado." + cliente.getNome());
        } else {
            System.out.println("status do pedido indefinido.");
        }
    }
}
