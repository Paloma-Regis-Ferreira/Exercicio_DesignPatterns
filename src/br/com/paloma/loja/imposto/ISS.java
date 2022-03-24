package br.com.paloma.loja.imposto;

import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
