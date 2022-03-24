package br.com.paloma.loja.pedido.acao;

import br.com.paloma.loja.pedido.AcaoAposGerarPedido;
import br.com.paloma.loja.pedido.Pedido;

public class EnviarEmailDoPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando e-mail com dados do pedido");
    }
}
