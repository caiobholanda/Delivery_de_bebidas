package com.delivery.repositorio;

import java.util.List;
import com.delivery.dominio.*;
public interface EntregadorRepository extends Leitura<Entregador>, Escrita<Entregador> {
    List<Entregador> listarDisponiveis();
}
