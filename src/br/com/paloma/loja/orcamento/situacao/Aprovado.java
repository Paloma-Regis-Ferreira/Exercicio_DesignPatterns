package br.com.paloma.loja.orcamento.situacao;

import br.com.paloma.loja.DomainException;
import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    @Override
    public BigDecimal valorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal(("0.05")));
    }

    @Override
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
