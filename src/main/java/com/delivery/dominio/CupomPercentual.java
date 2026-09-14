package com.delivery.dominio;

import java.math.BigDecimal;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class CupomPercentual extends Cupom {
    private BigDecimal percentual;

    public BigDecimal getPercentual() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal calcularDesconto(BigDecimal subtotal) {
        throw new UnsupportedOperationException();
    }
}
