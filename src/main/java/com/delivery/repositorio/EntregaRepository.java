package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public interface EntregaRepository extends Leitura<Entrega>, Escrita<Entrega> {
    List<Entrega> listarPorEntregador(Entregador entregador);
    int contarAtivasPorEntregador(Entregador entregador);
}
