package com.delivery.repositorio;

import com.delivery.dominio.*;
public interface UsuarioRepository extends Leitura<Usuario>, Escrita<Usuario> {
    Usuario buscarPorEmail(String email);
}
