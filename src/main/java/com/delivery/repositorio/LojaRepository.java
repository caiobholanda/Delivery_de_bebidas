package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public class LojaRepository implements Leitura<Loja>, Escrita<Loja> {
    public Loja buscarPorCnpj(String cnpj) {
        throw new UnsupportedOperationException();
    }

    public Loja buscarPorId(int id) {
        throw new UnsupportedOperationException();
    }
    public List<Loja> listar() {
        throw new UnsupportedOperationException();
    }
    public Loja salvar(Loja entidade) {
        throw new UnsupportedOperationException();
    }
    public void remover(int id) {
    }
}
