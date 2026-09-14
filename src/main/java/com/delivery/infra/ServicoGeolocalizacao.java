package com.delivery.infra;

import com.delivery.dominio.*;
public interface ServicoGeolocalizacao {
    double distanciaKm(Endereco origem, Endereco destino);
}
