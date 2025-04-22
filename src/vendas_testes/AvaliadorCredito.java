package vendas_testes;

import java.util.Random;

public class AvaliadorCredito {
    public boolean aprovarCredito(Cliente cliente) {
        return new Random().nextBoolean();
    }
}
