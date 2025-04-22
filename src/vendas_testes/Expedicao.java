package vendas_testes;

public class Expedicao {
    public void separarPedido(Pedido pedido) {
        System.out.println("o pedido do cliente foi salvo: " + pedido.getCliente().getNome());
    }
}
