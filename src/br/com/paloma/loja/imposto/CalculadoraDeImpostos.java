package br.com.paloma.loja.imposto;

import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal efetuarCalculo(Orcamento orcamento, Imposto imposto){
        return imposto.efetuarCalculo(orcamento);
    }
}
