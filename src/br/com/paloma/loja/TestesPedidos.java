package br.com.paloma.loja;

import br.com.paloma.loja.orcamento.Orcamento;
import br.com.paloma.loja.pedido.GerarPedido;
import br.com.paloma.loja.pedido.GerarPedidoHandler;
import br.com.paloma.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestesPedidos {

    public static void main(String[] args){

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        Integer quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler();//aqui passaria as dependencias
        handler.execute(gerador);
    }
}
