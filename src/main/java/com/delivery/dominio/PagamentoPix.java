package com.delivery.dominio;

import com.delivery.dto.*;
import com.delivery.infra.*;
public class PagamentoPix extends Pagamento {
    private String chaveRecebedora;
    private String qrCode;

    public String getQrCode() {
        throw new UnsupportedOperationException();
    }
    public boolean autorizar(GatewayPagamento gateway) {
        throw new UnsupportedOperationException();
    }
}
