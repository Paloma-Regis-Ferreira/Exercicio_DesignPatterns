package br.com.paloma.loja.pedido;

import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GerarPedido{

    private String cliente;
    private BigDecimal valorOrcamento;
    private Integer quantidadeItens;

    public GerarPedido(String cliente, BigDecimal valorOrcamento, Integer quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }
}
