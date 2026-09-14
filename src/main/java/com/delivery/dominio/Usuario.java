package com.delivery.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.delivery.dto.*;
import com.delivery.infra.*;
public abstract class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String senhaHash;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataCadastro;
    private boolean ativo;

    public int getIdUsuario() {
        throw new UnsupportedOperationException();
    }
    public String getNome() {
        throw new UnsupportedOperationException();
    }
    public String getEmail() {
        throw new UnsupportedOperationException();
    }
    public String getTelefone() {
        throw new UnsupportedOperationException();
    }
    public LocalDate getDataNascimento() {
        throw new UnsupportedOperationException();
    }
    public LocalDateTime getDataCadastro() {
        throw new UnsupportedOperationException();
    }
    public String getSenhaHash() {
        throw new UnsupportedOperationException();
    }
    public boolean isAtivo() {
        throw new UnsupportedOperationException();
    }
    public void setNome(String nome) {
    }
    public void setEmail(String email) {
    }
    public void setTelefone(String telefone) {
    }
    public void setAtivo(boolean ativo) {
    }
    public void definirSenhaHash(String hash) {
    }
    public boolean maiorDeIdade() {
        throw new UnsupportedOperationException();
    }
    public abstract TipoPerfil perfil();
    protected boolean validarEmail(String email) {
        throw new UnsupportedOperationException();
    }
}
