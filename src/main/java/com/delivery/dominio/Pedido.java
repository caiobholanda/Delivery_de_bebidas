package com.delivery.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private Loja loja;
    private EnderecoEntrega enderecoEntrega;
    private List<ItemPedido> itens;
    private StatusPedido status;
    private TipoEntrega tipoEntrega;
    private LocalDateTime dataPedido;
    private BigDecimal subtotal;
    private BigDecimal desconto;
    private BigDecimal taxaEntrega;
    private BigDecimal valorTotal;
    private String observacao;
    private String motivoCancelamento;
    private Pagamento pagamento;
    private Entrega entrega;

    public int getIdPedido() {
        throw new UnsupportedOperationException();
    }
    public List<ItemPedido> getItens() {
        throw new UnsupportedOperationException();
    }
    public StatusPedido getStatus() {
        throw new UnsupportedOperationException();
    }
    public TipoEntrega getTipoEntrega() {
        throw new UnsupportedOperationException();
    }
    public LocalDateTime getDataPedido() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getSubtotal() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getDesconto() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getTaxaEntrega() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getValorTotal() {
        throw new UnsupportedOperationException();
    }
    public String getObservacao() {
        throw new UnsupportedOperationException();
    }
    public String getMotivoCancelamento() {
        throw new UnsupportedOperationException();
    }
    public void setObservacao(String observacao) {
    }
    public String nomeCliente() {
        throw new UnsupportedOperationException();
    }
    public String nomeLoja() {
        throw new UnsupportedOperationException();
    }
    public String enderecoFormatado() {
        throw new UnsupportedOperationException();
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
    public boolean clientePodeComprar() {
        throw new UnsupportedOperationException();
    }
    public boolean podeSerCancelado() {
        throw new UnsupportedOperationException();
    }
    public boolean atualizarStatus(StatusPedido novo) {
        throw new UnsupportedOperationException();
    }
    public boolean cancelar(String motivo) {
        throw new UnsupportedOperationException();
    }
    public void registrarPagamento(Pagamento pagamento) {
    }
    public void registrarEntrega(Entrega entrega) {
    }
    public ResumoPedido resumo() {
        throw new UnsupportedOperationException();
    }
}
