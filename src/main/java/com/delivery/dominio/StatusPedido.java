package com.delivery.dominio;

import com.delivery.dto.*;
import com.delivery.infra.*;
public enum StatusPedido {
    CRIADO, AGUARDANDO_PAGAMENTO, PAGO, EM_PREPARO, SAIU_PARA_ENTREGA, PRONTO_PARA_RETIRADA, ENTREGUE, CANCELADO;

    public boolean podeTransitarPara(StatusPedido destino) {
        throw new UnsupportedOperationException();
    }
}
