package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public class UsuarioRepository implements Leitura<Usuario>, Escrita<Usuario> {
    public Usuario buscarPorEmail(String email) {
        throw new UnsupportedOperationException();
    }

    public Usuario buscarPorId(int id) {
        throw new UnsupportedOperationException();
    }
    public List<Usuario> listar() {
        throw new UnsupportedOperationException();
    }
    public Usuario salvar(Usuario entidade) {
        throw new UnsupportedOperationException();
    }
    public void remover(int id) {
    }
}
