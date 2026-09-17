package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public class EntregaRepository implements Leitura<Entrega>, Escrita<Entrega> {
    public List<Entrega> listarPorEntregador(Entregador entregador) {
        throw new UnsupportedOperationException();
    }
    public int contarAtivasPorEntregador(Entregador entregador) {
        throw new UnsupportedOperationException();
    }

    public Entrega buscarPorId(int id) {
        throw new UnsupportedOperationException();
    }
    public List<Entrega> listar() {
        throw new UnsupportedOperationException();
    }
    public Entrega salvar(Entrega entidade) {
        throw new UnsupportedOperationException();
    }
    public void remover(int id) {
    }
}
