package vendas_testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorPedidoTest {

    @Test
    public void testPedidoFinalizadoCancelado() {
        BancoDeDados bd = new BancoDeDados();
        Cliente cliente = bd.obterRandomCliente();
        Pedido pedido = new Pedido(cliente);

        ProcessadorPedido processador = new ProcessadorPedido();
        processador.processar(pedido);

        assertTrue(pedido.isFinalizado() || pedido.isCancelado(), "o pedido deve ser finalizado ou cancelado.");
    }

    @Test
    public void testClientePedido() {
        Cliente cliente = new Cliente("taylor swift", 13);
        Pedido pedido = new Pedido(cliente);
        assertEquals("taylor swift", pedido.getCliente().getNome());
    }
}
