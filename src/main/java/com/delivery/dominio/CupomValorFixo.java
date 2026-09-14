package com.delivery.dominio;

import java.math.BigDecimal;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class CupomValorFixo extends Cupom {
    private BigDecimal valor;

    public BigDecimal getValor() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal calcularDesconto(BigDecimal subtotal) {
        throw new UnsupportedOperationException();
    }
}
