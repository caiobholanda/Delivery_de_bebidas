package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public class BebidaRepository implements Leitura<Bebida>, Escrita<Bebida> {
    public List<Bebida> buscarPorCategoria(Categoria categoria) {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> buscarPorTermo(String termo) {
        throw new UnsupportedOperationException();
    }

    public Bebida buscarPorId(int id) {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> listar() {
        throw new UnsupportedOperationException();
    }
    public Bebida salvar(Bebida entidade) {
        throw new UnsupportedOperationException();
    }
    public void remover(int id) {
    }
}
