package com.delivery.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class Carrinho {
    private int idCarrinho;
    private List<ItemCarrinho> itens;
    private Cupom cupom;
    private LocalDateTime atualizadoEm;

    public int getIdCarrinho() {
        throw new UnsupportedOperationException();
    }
    public List<ItemCarrinho> getItens() {
        throw new UnsupportedOperationException();
    }
    public Cupom getCupom() {
        throw new UnsupportedOperationException();
    }
    public LocalDateTime getAtualizadoEm() {
        throw new UnsupportedOperationException();
    }
    public ItemCarrinho adicionarItem(Bebida bebida, int quantidade) {
        throw new UnsupportedOperationException();
    }
    public void removerItem(int idItemCarrinho) {
    }
    public void alterarQuantidade(int idItemCarrinho, int quantidade) {
    }
    public boolean aplicarCupom(Cupom cupom) {
        throw new UnsupportedOperationException();
    }
    public void removerCupom() {
    }
    public BigDecimal calcularSubtotal() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal calcularDesconto() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal calcularTotal() {
        throw new UnsupportedOperationException();
    }
    public boolean contemAlcoolicos() {
        throw new UnsupportedOperationException();
    }
    public boolean estaVazio() {
        throw new UnsupportedOperationException();
    }
    public void limpar() {
    }
    public Pedido gerarPedido(Loja loja, EnderecoEntrega enderecoEntrega, TipoEntrega tipoEntrega, BigDecimal taxaEntrega) {
        throw new UnsupportedOperationException();
    }
}
