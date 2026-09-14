package com.delivery.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import com.delivery.dominio.*;
public class ResumoPedido {
    private int idPedido;
    private String nomeCliente;
    private String nomeLoja;
    private StatusPedido status;
    private LocalDateTime dataPedido;
    private BigDecimal valorTotal;
    private String enderecoFormatado;
    private List<String> itens;

    public int getIdPedido() {
        throw new UnsupportedOperationException();
    }
    public String getNomeCliente() {
        throw new UnsupportedOperationException();
    }
    public String getNomeLoja() {
        throw new UnsupportedOperationException();
    }
    public StatusPedido getStatus() {
        throw new UnsupportedOperationException();
    }
    public LocalDateTime getDataPedido() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getValorTotal() {
        throw new UnsupportedOperationException();
    }
    public String getEnderecoFormatado() {
        throw new UnsupportedOperationException();
    }
    public List<String> getItens() {
        throw new UnsupportedOperationException();
    }
}
