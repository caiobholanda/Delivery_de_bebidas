package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public class CupomRepository implements Leitura<Cupom>, Escrita<Cupom> {
    public Cupom buscarPorCodigo(String codigo) {
        throw new UnsupportedOperationException();
    }

    public Cupom buscarPorId(int id) {
        throw new UnsupportedOperationException();
    }
    public List<Cupom> listar() {
        throw new UnsupportedOperationException();
    }
    public Cupom salvar(Cupom entidade) {
        throw new UnsupportedOperationException();
    }
    public void remover(int id) {
    }
}
