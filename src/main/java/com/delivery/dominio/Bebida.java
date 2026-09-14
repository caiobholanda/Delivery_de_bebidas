package com.delivery.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class Bebida {
    private int idBebida;
    private String nome;
    private String marca;
    private String descricao;
    private String urlFoto;
    private BigDecimal preco;
    private BigDecimal precoPromocional;
    private LocalDate inicioPromocao;
    private LocalDate fimPromocao;
    private TipoVenda tipoVenda;
    private int volumeMl;
    private double teorAlcoolico;
    private boolean retornavel;
    private BigDecimal valorCasco;
    private boolean destaque;
    private boolean ativa;
    private Categoria categoria;
    private Estoque estoque;

    public int getIdBebida() {
        throw new UnsupportedOperationException();
    }
    public void setIdBebida(int idBebida) {
    }
    public String getNome() {
        throw new UnsupportedOperationException();
    }
    public void setNome(String nome) {
    }
    public String getMarca() {
        throw new UnsupportedOperationException();
    }
    public void setMarca(String marca) {
    }
    public String getDescricao() {
        throw new UnsupportedOperationException();
    }
    public void setDescricao(String descricao) {
    }
    public String getUrlFoto() {
        throw new UnsupportedOperationException();
    }
    public void setUrlFoto(String urlFoto) {
    }
    public BigDecimal getPreco() {
        throw new UnsupportedOperationException();
    }
    public void setPreco(BigDecimal preco) {
    }
    public BigDecimal getPrecoPromocional() {
        throw new UnsupportedOperationException();
    }
    public void setPrecoPromocional(BigDecimal precoPromocional) {
    }
    public LocalDate getInicioPromocao() {
        throw new UnsupportedOperationException();
    }
    public void setInicioPromocao(LocalDate inicioPromocao) {
    }
    public LocalDate getFimPromocao() {
        throw new UnsupportedOperationException();
    }
    public void setFimPromocao(LocalDate fimPromocao) {
    }
    public TipoVenda getTipoVenda() {
        throw new UnsupportedOperationException();
    }
    public void setTipoVenda(TipoVenda tipoVenda) {
    }
    public int getVolumeMl() {
        throw new UnsupportedOperationException();
    }
    public void setVolumeMl(int volumeMl) {
    }
    public double getTeorAlcoolico() {
        throw new UnsupportedOperationException();
    }
    public void setTeorAlcoolico(double teorAlcoolico) {
    }
    public boolean isRetornavel() {
        throw new UnsupportedOperationException();
    }
    public void setRetornavel(boolean retornavel) {
    }
    public BigDecimal getValorCasco() {
        throw new UnsupportedOperationException();
    }
    public void setValorCasco(BigDecimal valorCasco) {
    }
    public boolean isDestaque() {
        throw new UnsupportedOperationException();
    }
    public void setDestaque(boolean destaque) {
    }
    public boolean isAtiva() {
        throw new UnsupportedOperationException();
    }
    public void setAtiva(boolean ativa) {
    }
    public Categoria getCategoria() {
        throw new UnsupportedOperationException();
    }
    public void setCategoria(Categoria categoria) {
    }
    public Estoque getEstoque() {
        throw new UnsupportedOperationException();
    }
    public void setEstoque(Estoque estoque) {
    }
    public BigDecimal precoAtual() {
        throw new UnsupportedOperationException();
    }
    public boolean emPromocao() {
        throw new UnsupportedOperationException();
    }
    public boolean isAlcoolica() {
        throw new UnsupportedOperationException();
    }
    public boolean estaDisponivel(int quantidade) {
        throw new UnsupportedOperationException();
    }
    public boolean temGelada() {
        throw new UnsupportedOperationException();
    }
    public boolean exigeVerificacaoIdade() {
        throw new UnsupportedOperationException();
    }
    public void desativar() {
    }
}
