package com.delivery.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.delivery.dto.*;
import com.delivery.infra.*;
public abstract class Cupom {
    private int idCupom;
    private String codigo;
    private BigDecimal valorMinimoPedido;
    private LocalDate validade;
    private boolean ativo;

    public int getIdCupom() {
        throw new UnsupportedOperationException();
    }
    public String getCodigo() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getValorMinimoPedido() {
        throw new UnsupportedOperationException();
    }
    public LocalDate getValidade() {
        throw new UnsupportedOperationException();
    }
    public boolean isAtivo() {
        throw new UnsupportedOperationException();
    }
    public void setValorMinimoPedido(BigDecimal valorMinimoPedido) {
    }
    public void setValidade(LocalDate validade) {
    }
    public void setAtivo(boolean ativo) {
    }
    public boolean estaValido(BigDecimal subtotal) {
        throw new UnsupportedOperationException();
    }
    public abstract BigDecimal calcularDesconto(BigDecimal subtotal);
}
