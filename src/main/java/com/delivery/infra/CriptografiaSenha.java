package com.delivery.infra;

import com.delivery.dominio.*;
public interface CriptografiaSenha {
    String gerarHash(String senha);
    boolean verificar(String senha, String hash);
}
