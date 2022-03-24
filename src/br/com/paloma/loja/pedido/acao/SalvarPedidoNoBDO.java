package br.com.paloma.loja.pedido.acao;

import br.com.paloma.loja.pedido.AcaoAposGerarPedido;
import br.com.paloma.loja.pedido.Pedido;

public class SalvarPedidoNoBDO implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados");
    }
}
