package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public interface BebidaRepository extends Leitura<Bebida>, Escrita<Bebida> {
    List<Bebida> buscarPorCategoria(Categoria categoria);
    List<Bebida> buscarPorTermo(String termo);
}
