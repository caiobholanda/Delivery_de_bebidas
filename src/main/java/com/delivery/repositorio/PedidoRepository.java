package com.delivery.repositorio;

import java.time.LocalDate;
import java.util.List;
import com.delivery.dominio.*;
public class PedidoRepository implements Leitura<Pedido>, Escrita<Pedido> {
    public List<Pedido> listarPorCliente(Cliente cliente) {
        throw new UnsupportedOperationException();
    }
    public List<Pedido> listarPorPeriodo(LocalDate inicio, LocalDate fim) {
        throw new UnsupportedOperationException();
    }
    public List<Pedido> listarPorClienteEPeriodo(Cliente cliente, LocalDate inicio, LocalDate fim) {
        throw new UnsupportedOperationException();
    }

    public Pedido buscarPorId(int id) {
        throw new UnsupportedOperationException();
    }
    public List<Pedido> listar() {
        throw new UnsupportedOperationException();
    }
    public Pedido salvar(Pedido entidade) {
        throw new UnsupportedOperationException();
    }
    public void remover(int id) {
    }
}
