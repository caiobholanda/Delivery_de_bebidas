package com.delivery.dominio;

import java.math.BigDecimal;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class PagamentoDinheiro extends Pagamento {
    private BigDecimal trocoPara;

    public BigDecimal getTrocoPara() {
        throw new UnsupportedOperationException();
    }
    public void setTrocoPara(BigDecimal trocoPara) {
    }
    public boolean autorizar(GatewayPagamento gateway) {
        throw new UnsupportedOperationException();
    }
    public boolean precisaTroco() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal calcularTroco() {
        throw new UnsupportedOperationException();
    }
}
