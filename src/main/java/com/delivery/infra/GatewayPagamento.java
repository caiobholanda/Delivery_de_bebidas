package com.delivery.infra;

import com.delivery.dominio.*;
public interface GatewayPagamento {
    boolean autorizar(Pagamento pagamento);
    boolean confirmar(String codigoTransacao);
    boolean estornar(String codigoTransacao);
}
