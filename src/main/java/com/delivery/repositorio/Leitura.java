package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public interface Leitura<T> {
    T buscarPorId(int id);
    List<T> listar();
}
