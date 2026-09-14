package com.delivery.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.delivery.dto.*;
import com.delivery.infra.*;
public abstract class Pagamento {
    private int idPagamento;
    private BigDecimal valor;
    private StatusPagamento status;
    private LocalDateTime dataPagamento;
    private String codigoTransacao;

    public int getIdPagamento() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getValor() {
        throw new UnsupportedOperationException();
    }
    public StatusPagamento getStatus() {
        throw new UnsupportedOperationException();
    }
    public LocalDateTime getDataPagamento() {
        throw new UnsupportedOperationException();
    }
    public String getCodigoTransacao() {
        throw new UnsupportedOperationException();
    }
    public abstract boolean autorizar(GatewayPagamento gateway);
    public void confirmar(String codigo) {
    }
    public boolean estornar(GatewayPagamento gateway) {
        throw new UnsupportedOperationException();
    }
}
