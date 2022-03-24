package br.com.paloma.loja.orcamento.situacao;

import br.com.paloma.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    @Override
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
