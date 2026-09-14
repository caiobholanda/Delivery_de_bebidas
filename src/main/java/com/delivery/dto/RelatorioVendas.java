package com.delivery.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import com.delivery.dominio.*;
public class RelatorioVendas {
    private LocalDate inicio;
    private LocalDate fim;
    private int totalPedidos;
    private BigDecimal faturamento;
    private BigDecimal ticketMedio;
    private List<String> itensMaisVendidos;

    public LocalDate getInicio() {
        throw new UnsupportedOperationException();
    }
    public LocalDate getFim() {
        throw new UnsupportedOperationException();
    }
    public int getTotalPedidos() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getFaturamento() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getTicketMedio() {
        throw new UnsupportedOperationException();
    }
    public List<String> getItensMaisVendidos() {
        throw new UnsupportedOperationException();
    }
}
