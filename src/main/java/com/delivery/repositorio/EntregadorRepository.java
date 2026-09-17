package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public class EntregadorRepository implements Leitura<Entregador>, Escrita<Entregador> {
    public List<Entregador> listarDisponiveis() {
        throw new UnsupportedOperationException();
    }

    public Entregador buscarPorId(int id) {
        throw new UnsupportedOperationException();
    }
    public List<Entregador> listar() {
        throw new UnsupportedOperationException();
    }
    public Entregador salvar(Entregador entidade) {
        throw new UnsupportedOperationException();
    }
    public void remover(int id) {
    }
}
