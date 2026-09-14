package com.delivery.infra;

import com.delivery.dominio.*;
public class GatewayCartao implements GatewayPagamento {
    public boolean autorizar(Pagamento pagamento) {
        throw new UnsupportedOperationException();
    }
    public boolean confirmar(String codigoTransacao) {
        throw new UnsupportedOperationException();
    }
    public boolean estornar(String codigoTransacao) {
        throw new UnsupportedOperationException();
    }
}
