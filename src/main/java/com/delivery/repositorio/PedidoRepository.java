package com.delivery.repositorio;

import java.time.LocalDate;
import java.util.List;
import com.delivery.dominio.*;
public interface PedidoRepository extends Leitura<Pedido>, Escrita<Pedido> {
    List<Pedido> listarPorCliente(Cliente cliente);
    List<Pedido> listarPorPeriodo(LocalDate inicio, LocalDate fim);
}
