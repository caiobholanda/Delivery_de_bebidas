package com.delivery.dominio;

import java.math.BigDecimal;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class ItemCarrinho {
    private int idItemCarrinho;
    private Bebida bebida;
    private int quantidade;

    public int getIdItemCarrinho() {
        throw new UnsupportedOperationException();
    }
    public int getQuantidade() {
        throw new UnsupportedOperationException();
    }
    public void setQuantidade(int quantidade) {
    }
    public String nomeBebida() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal precoUnitario() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal calcularTotal() {
        throw new UnsupportedOperationException();
    }
    public boolean isAlcoolico() {
        throw new UnsupportedOperationException();
    }
    public ItemPedido gerarItemPedido() {
        throw new UnsupportedOperationException();
    }
}
