package com.delivery.controlador;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import com.delivery.dominio.*;
import com.delivery.dto.*;
import com.delivery.servico.*;
import com.delivery.repositorio.*;
import com.delivery.infra.*;
public class ControladorPedido {
    public ResumoPedido finalizarPedido(Cliente cliente, int idEndereco, int idLoja, TipoEntrega tipoEntrega, TipoPagamento tipoPagamento, int parcelas, BigDecimal trocoPara) {
        throw new UnsupportedOperationException();
    }
    public void confirmarPagamento(int idPedido, String codigoTransacao) {
    }
    public boolean cancelarPedido(int idPedido, String motivo) {
        throw new UnsupportedOperationException();
    }
    public boolean alterarStatus(Administrador admin, int idPedido, StatusPedido status) {
        throw new UnsupportedOperationException();
    }
    public ResumoPedido consultarPedido(int idPedido) {
        throw new UnsupportedOperationException();
    }
    public List<ResumoPedido> historicoDoCliente(Cliente cliente, LocalDate inicio, LocalDate fim) {
        throw new UnsupportedOperationException();
    }
}
