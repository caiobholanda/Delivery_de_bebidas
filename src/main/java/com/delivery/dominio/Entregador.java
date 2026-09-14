package com.delivery.dominio;

import com.delivery.dto.*;
import com.delivery.infra.*;
public class Entregador extends Usuario {
    private String cnh;
    private TipoVeiculo tipoVeiculo;
    private String placa;
    private boolean disponivel;

    public String getCnh() {
        throw new UnsupportedOperationException();
    }
    public TipoVeiculo getTipoVeiculo() {
        throw new UnsupportedOperationException();
    }
    public String getPlaca() {
        throw new UnsupportedOperationException();
    }
    public boolean isDisponivel() {
        throw new UnsupportedOperationException();
    }
    public void setDisponivel(boolean disponivel) {
    }
    public boolean podeAceitarEntrega(int entregasAtivas) {
        throw new UnsupportedOperationException();
    }
    public TipoPerfil perfil() {
        throw new UnsupportedOperationException();
    }
}
