package com.delivery.repositorio;

import com.delivery.dominio.*;
public interface CupomRepository extends Leitura<Cupom>, Escrita<Cupom> {
    Cupom buscarPorCodigo(String codigo);
}
