package br.com.paloma.loja.orcamento;

import br.com.paloma.loja.orcamento.situacao.EmAnalise;
import br.com.paloma.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacaoOrcamento = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public void aplicarDescontoExtra(){
        BigDecimal descontoExtra = this.situacaoOrcamento.valorDescontoExtra(this);
        this.valor = this.valor.subtract(descontoExtra);
    }

    public void aprovar(){
        this.situacaoOrcamento.aprovar(this);
    }

    public void reprovar(){
        this.situacaoOrcamento.reprovar(this);
    }

    public void finalizar(){
        this.situacaoOrcamento.finalizar(this);
    }

}
