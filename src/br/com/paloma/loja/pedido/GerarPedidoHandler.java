package br.com.paloma.loja.pedido;

import br.com.paloma.loja.orcamento.Orcamento;
import br.com.paloma.loja.pedido.acao.EnviarEmailDoPedido;
import br.com.paloma.loja.pedido.acao.SalvarPedidoNoBDO;

import java.time.LocalDate;
import java.util.List;

public class GerarPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;


    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GerarPedido dados) {
        //a ideia desse padrao é separar o que são dados e o que são ações
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

        acoes.forEach(x -> x.executarAcao(pedido));
    }
}
