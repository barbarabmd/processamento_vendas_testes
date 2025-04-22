package vendas_testes;

public class Pedido {
    private final Cliente cliente;
    private boolean finalizado = false;
    private boolean cancelado = false;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void finalizar() {
        this.finalizado = true;
    }

    public void cancelar() {
        this.cancelado = true;
    }
}
