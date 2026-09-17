package com.delivery.dominio;

import java.math.BigDecimal;
import java.util.List;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class Cliente extends Usuario {
    private List<Endereco> enderecos;
    private Carrinho carrinho;
    private List<Bebida> favoritos;
    private boolean idadeVerificada;

    public List<Endereco> getEnderecos() {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> getFavoritos() {
        throw new UnsupportedOperationException();
    }
    public boolean isIdadeVerificada() {
        throw new UnsupportedOperationException();
    }
    public boolean verificarIdade(String documento) {
        throw new UnsupportedOperationException();
    }
    public boolean podeComprarAlcoolicos() {
        throw new UnsupportedOperationException();
    }
    public void adicionarEndereco(Endereco endereco) {
    }
    public boolean removerEndereco(Endereco endereco) {
        throw new UnsupportedOperationException();
    }
    public void definirEnderecoPrincipal(Endereco endereco) {
    }
    public Endereco enderecoPrincipal() {
        throw new UnsupportedOperationException();
    }
    public Endereco enderecoPor(int idEndereco) {
        throw new UnsupportedOperationException();
    }
    public void favoritar(Bebida bebida) {
    }
    public void desfavoritar(Bebida bebida) {
    }
    public void adicionarAoCarrinho(Bebida bebida, int quantidade) {
    }
    public void removerDoCarrinho(int idItemCarrinho) {
    }
    public void alterarQuantidadeNoCarrinho(int idItemCarrinho, int quantidade) {
    }
    public boolean aplicarCupomNoCarrinho(Cupom cupom) {
        throw new UnsupportedOperationException();
    }
    public ResumoCarrinho resumoCarrinho() {
        throw new UnsupportedOperationException();
    }
    public Pedido gerarPedido(Loja loja, Endereco endereco, TipoEntrega tipoEntrega, BigDecimal taxaEntrega) {
        throw new UnsupportedOperationException();
    }
    public TipoPerfil perfil() {
        throw new UnsupportedOperationException();
    }
}
