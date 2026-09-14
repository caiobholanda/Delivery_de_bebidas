package com.delivery.repositorio;

import com.delivery.dominio.*;
public interface Escrita<T> {
    T salvar(T entidade);
    void remover(int id);
}
