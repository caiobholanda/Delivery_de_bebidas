package com.delivery.dominio;

import java.math.BigDecimal;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class ItemPedido {
    private int idItemPedido;
    private Bebida bebida;
    private String nomeBebida;
    private boolean alcoolica;
    private int quantidade;
    private BigDecimal precoUnitario;

    public int getIdItemPedido() {
        throw new UnsupportedOperationException();
    }
    public Bebida getBebida() {
        throw new UnsupportedOperationException();
    }
    public String getNomeBebida() {
        throw new UnsupportedOperationException();
    }
    public int getQuantidade() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getPrecoUnitario() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal calcularTotal() {
        throw new UnsupportedOperationException();
    }
    public boolean isAlcoolico() {
        throw new UnsupportedOperationException();
    }
}
