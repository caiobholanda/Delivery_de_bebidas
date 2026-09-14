package com.delivery.dto;

import java.math.BigDecimal;
import java.util.List;
import com.delivery.dominio.*;
public class ResumoCarrinho {
    private List<String> itens;
    private int quantidadeTotal;
    private BigDecimal subtotal;
    private BigDecimal desconto;
    private BigDecimal total;
    private boolean contemAlcoolicos;

    public List<String> getItens() {
        throw new UnsupportedOperationException();
    }
    public int getQuantidadeTotal() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getSubtotal() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getDesconto() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getTotal() {
        throw new UnsupportedOperationException();
    }
    public boolean isContemAlcoolicos() {
        throw new UnsupportedOperationException();
    }
}
