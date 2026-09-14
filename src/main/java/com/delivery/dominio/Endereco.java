package com.delivery.dominio;

import com.delivery.dto.*;
import com.delivery.infra.*;
public class Endereco {
    private int idEndereco;
    private String apelido;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String referencia;
    private double latitude;
    private double longitude;
    private boolean principal;

    public int getIdEndereco() {
        throw new UnsupportedOperationException();
    }
    public String getApelido() {
        throw new UnsupportedOperationException();
    }
    public String getLogradouro() {
        throw new UnsupportedOperationException();
    }
    public String getNumero() {
        throw new UnsupportedOperationException();
    }
    public String getComplemento() {
        throw new UnsupportedOperationException();
    }
    public String getBairro() {
        throw new UnsupportedOperationException();
    }
    public String getCidade() {
        throw new UnsupportedOperationException();
    }
    public String getUf() {
        throw new UnsupportedOperationException();
    }
    public String getCep() {
        throw new UnsupportedOperationException();
    }
    public String getReferencia() {
        throw new UnsupportedOperationException();
    }
    public double getLatitude() {
        throw new UnsupportedOperationException();
    }
    public double getLongitude() {
        throw new UnsupportedOperationException();
    }
    public boolean isPrincipal() {
        throw new UnsupportedOperationException();
    }
    public void setApelido(String apelido) {
    }
    public void setLogradouro(String logradouro) {
    }
    public void setNumero(String numero) {
    }
    public void setComplemento(String complemento) {
    }
    public void setBairro(String bairro) {
    }
    public void setCidade(String cidade) {
    }
    public void setUf(String uf) {
    }
    public void setCep(String cep) {
    }
    public void setReferencia(String referencia) {
    }
    public void setCoordenadas(double latitude, double longitude) {
    }
    void setPrincipal(boolean principal) {
    }
    public String formatarCompleto() {
        throw new UnsupportedOperationException();
    }
    public boolean validarCep() {
        throw new UnsupportedOperationException();
    }
    public EnderecoEntrega gerarSnapshot() {
        throw new UnsupportedOperationException();
    }
}
