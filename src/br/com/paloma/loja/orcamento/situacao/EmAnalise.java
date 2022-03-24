package br.com.paloma.loja.orcamento.situacao;

import br.com.paloma.loja.DomainException;
import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    @Override
    public BigDecimal valorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal(("0.05")));
    }

    @Override
    public void aprovar(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Reprovado());
    }
}
