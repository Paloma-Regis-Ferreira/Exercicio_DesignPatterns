package br.com.paloma.loja.desconto;

import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos{

    public BigDecimal calcular(Orcamento orcamento){
    Desconto cadeiaDeDescontos = new DescontoPorQuantidade(
            new DescontoPorValor(
                    new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
