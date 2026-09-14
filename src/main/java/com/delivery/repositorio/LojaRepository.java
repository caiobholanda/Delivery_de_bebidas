package com.delivery.repositorio;

import com.delivery.dominio.*;
public interface LojaRepository extends Leitura<Loja>, Escrita<Loja> {
    Loja buscarPorCnpj(String cnpj);
}
