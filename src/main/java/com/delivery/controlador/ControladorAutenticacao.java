package com.delivery.controlador;

import java.time.LocalDate;
import com.delivery.dominio.*;
import com.delivery.dto.*;
import com.delivery.servico.*;
import com.delivery.repositorio.*;
import com.delivery.infra.*;
public class ControladorAutenticacao {
    public Usuario autenticar(String email, String senha) {
        throw new UnsupportedOperationException();
    }
    public Cliente cadastrarCliente(String nome, String email, String senha, LocalDate dataNascimento) {
        throw new UnsupportedOperationException();
    }
    public boolean alterarSenha(Usuario usuario, String atual, String nova) {
        throw new UnsupportedOperationException();
    }
}
