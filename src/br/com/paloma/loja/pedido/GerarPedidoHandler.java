package br.com.paloma.loja.pedido;

import br.com.paloma.loja.orcamento.Orcamento;

import java.time.LocalDate;

public class GerarPedidoHandler {

    public void execute(GerarPedido dados) {

        //a ideia desse padrao é separar o que são dados e o que são ações
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

        System.out.println("Salvar pedido no bdo");
        System.out.println("Enviar email com o novo pedido");
    }
}
