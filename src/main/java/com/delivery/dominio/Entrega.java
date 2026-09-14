package com.delivery.dominio;

import java.time.LocalDateTime;
import com.delivery.dto.*;
import com.delivery.infra.*;
public class Entrega {
    private int idEntrega;
    private EnderecoEntrega enderecoEntrega;
    private Entregador entregador;
    private StatusEntrega status;
    private int previsaoMinutos;
    private LocalDateTime dataSaida;
    private LocalDateTime dataChegada;
    private boolean idadeConferida;
    private String motivoFalha;

    public int getIdEntrega() {
        throw new UnsupportedOperationException();
    }
    public Entregador getEntregador() {
        throw new UnsupportedOperationException();
    }
    public StatusEntrega getStatus() {
        throw new UnsupportedOperationException();
    }
    public int getPrevisaoMinutos() {
        throw new UnsupportedOperationException();
    }
    public LocalDateTime getDataSaida() {
        throw new UnsupportedOperationException();
    }
    public LocalDateTime getDataChegada() {
        throw new UnsupportedOperationException();
    }
    public boolean isIdadeConferida() {
        throw new UnsupportedOperationException();
    }
    public EnderecoEntrega getEnderecoEntrega() {
        throw new UnsupportedOperationException();
    }
    public void setPrevisaoMinutos(int previsaoMinutos) {
    }
    public boolean atribuirEntregador(Entregador entregador) {
        throw new UnsupportedOperationException();
    }
    public void iniciar() {
    }
    public void registrarConferenciaIdade(boolean conferida) {
    }
    public void finalizar() {
    }
    public void registrarFalha(String motivo) {
    }
    public int tempoDecorrido() {
        throw new UnsupportedOperationException();
    }
    public boolean estaAtrasada() {
        throw new UnsupportedOperationException();
    }
}
