package vendas_testes;

import java.util.Random;

public class BancoDeDados {
    public Cliente obterRandomCliente() {
        int id = new Random().nextInt(1000);
        return new Cliente("cliente n:" + id, id);
    }
}
