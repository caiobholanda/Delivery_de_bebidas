package com.delivery.dominio;

import com.delivery.dto.*;
import com.delivery.infra.*;
public class Estoque {
    private int quantidade;
    private int quantidadeGelada;
    private int minimo;

    public int getQuantidade() {
        throw new UnsupportedOperationException();
    }
    public int getQuantidadeGelada() {
        throw new UnsupportedOperationException();
    }
    public int getMinimo() {
        throw new UnsupportedOperationException();
    }
    public boolean temDisponivel(int quantidade) {
        throw new UnsupportedOperationException();
    }
    public boolean baixar(int quantidade) {
        throw new UnsupportedOperationException();
    }
    public void repor(int quantidade) {
    }
    public boolean estaBaixo() {
        throw new UnsupportedOperationException();
    }
    public boolean temGelada() {
        throw new UnsupportedOperationException();
    }
}
