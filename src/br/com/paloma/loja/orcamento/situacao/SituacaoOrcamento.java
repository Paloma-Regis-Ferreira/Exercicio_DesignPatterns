package br.com.paloma.loja.orcamento.situacao;

import br.com.paloma.loja.DomainException;
import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal valorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser finalizado");
    }
}
