package com.delivery.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class Loja {
    private int idLoja;
    private String nomeFantasia;
    private String cnpj;
    private Endereco endereco;
    private LocalTime horarioAbertura;
    private LocalTime horarioFechamento;
    private double raioEntregaKm;
    private BigDecimal taxaEntregaBase;
    private BigDecimal pedidoMinimo;

    public int getIdLoja() {
        throw new UnsupportedOperationException();
    }
    public String getNomeFantasia() {
        throw new UnsupportedOperationException();
    }
    public String getCnpj() {
        throw new UnsupportedOperationException();
    }
    public Endereco getEndereco() {
        throw new UnsupportedOperationException();
    }
    public LocalTime getHorarioAbertura() {
        throw new UnsupportedOperationException();
    }
    public LocalTime getHorarioFechamento() {
        throw new UnsupportedOperationException();
    }
    public double getRaioEntregaKm() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getTaxaEntregaBase() {
        throw new UnsupportedOperationException();
    }
    public BigDecimal getPedidoMinimo() {
        throw new UnsupportedOperationException();
    }
    public void setHorarioAbertura(LocalTime horarioAbertura) {
    }
    public void setHorarioFechamento(LocalTime horarioFechamento) {
    }
    public void setRaioEntregaKm(double raioEntregaKm) {
    }
    public void setTaxaEntregaBase(BigDecimal taxaEntregaBase) {
    }
    public void setPedidoMinimo(BigDecimal pedidoMinimo) {
    }
    public boolean estaAberta(LocalDateTime momento) {
        throw new UnsupportedOperationException();
    }
    public boolean atendeEndereco(Endereco endereco, ServicoGeolocalizacao geo) {
        throw new UnsupportedOperationException();
    }
    public boolean atingePedidoMinimo(BigDecimal subtotal) {
        throw new UnsupportedOperationException();
    }
    public BigDecimal calcularTaxaEntrega(Endereco endereco, ServicoGeolocalizacao geo) {
        throw new UnsupportedOperationException();
    }
}
