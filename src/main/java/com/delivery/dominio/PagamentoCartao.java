package com.delivery.dominio;

import com.delivery.dto.*;
import com.delivery.infra.*;
public class PagamentoCartao extends Pagamento {
    private String bandeira;
    private String ultimosDigitos;
    private int parcelas;

    public String getBandeira() {
        throw new UnsupportedOperationException();
    }
    public String getUltimosDigitos() {
        throw new UnsupportedOperationException();
    }
    public int getParcelas() {
        throw new UnsupportedOperationException();
    }
    public boolean autorizar(GatewayPagamento gateway) {
        throw new UnsupportedOperationException();
    }
}
