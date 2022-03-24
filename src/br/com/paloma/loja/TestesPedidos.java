package br.com.paloma.loja;

import br.com.paloma.loja.orcamento.Orcamento;
import br.com.paloma.loja.pedido.GerarPedido;
import br.com.paloma.loja.pedido.GerarPedidoHandler;
import br.com.paloma.loja.pedido.Pedido;
import br.com.paloma.loja.pedido.acao.EnviarEmailDoPedido;
import br.com.paloma.loja.pedido.acao.SalvarPedidoNoBDO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args){

        String cliente = "Paloma";
        BigDecimal valorOrcamento = new BigDecimal("300");
        Integer quantidadeItens = Integer.parseInt("2");

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBDO(), new EnviarEmailDoPedido())
        );//aqui passaria as dependencias
        handler.execute(gerador);
    }
}
