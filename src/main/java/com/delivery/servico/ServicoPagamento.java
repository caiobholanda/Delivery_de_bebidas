package com.delivery.servico;

import java.math.BigDecimal;
import com.delivery.dominio.*;
import com.delivery.dto.*;
import com.delivery.repositorio.*;
import com.delivery.infra.*;
public class ServicoPagamento {
    private FabricaPagamento fabrica;
    private GatewayPagamento gateway;

    public Pagamento iniciarPagamento(Pedido pedido, TipoPagamento tipo, int parcelas, BigDecimal trocoPara) {
        throw new UnsupportedOperationException();
    }
    public void confirmarPagamento(Pedido pedido, String codigoTransacao) {
    }
    public boolean estornarPagamento(Pedido pedido) {
        throw new UnsupportedOperationException();
    }
}
