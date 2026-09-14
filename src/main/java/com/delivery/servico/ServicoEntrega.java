package com.delivery.servico;

import com.delivery.dominio.*;
import com.delivery.dto.*;
import com.delivery.repositorio.*;
import com.delivery.infra.*;
public class ServicoEntrega {
    private EntregaRepository entregaRepository;

    public Entrega gerarEntrega(Pedido pedido) {
        throw new UnsupportedOperationException();
    }
    public boolean atribuirEntregador(Entrega entrega, Entregador entregador) {
        throw new UnsupportedOperationException();
    }
    public int entregasAtivasDe(Entregador entregador) {
        throw new UnsupportedOperationException();
    }
}
