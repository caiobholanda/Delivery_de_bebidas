package com.delivery.servico;

import java.math.BigDecimal;
import java.util.List;
import com.delivery.dominio.*;
import com.delivery.dto.*;
import com.delivery.repositorio.*;
import com.delivery.infra.*;
public class Catalogo {
    public Bebida buscarPorId(int idBebida) {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> buscar(String termo) {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> filtrarPorCategoria(Categoria categoria) {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> filtrarPorFaixaPreco(BigDecimal min, BigDecimal max) {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> listarDestaques() {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> listarPromocoes() {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> listarGeladas() {
        throw new UnsupportedOperationException();
    }
    public List<Bebida> ordenarPorPreco(boolean crescente) {
        throw new UnsupportedOperationException();
    }
    public void cadastrar(Bebida bebida) {
    }
    public void atualizar(Bebida bebida) {
    }
    public void remover(int idBebida) {
    }
}
