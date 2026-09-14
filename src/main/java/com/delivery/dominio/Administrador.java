package com.delivery.dominio;

import com.delivery.dto.*;
import com.delivery.infra.*;
public class Administrador extends Usuario {
    private String matricula;
    private NivelAcesso nivel;

    public String getMatricula() {
        throw new UnsupportedOperationException();
    }
    public NivelAcesso getNivel() {
        throw new UnsupportedOperationException();
    }
    public void setNivel(NivelAcesso nivel) {
    }
    public boolean possuiPermissao(Acao acao) {
        throw new UnsupportedOperationException();
    }
    public TipoPerfil perfil() {
        throw new UnsupportedOperationException();
    }
}
