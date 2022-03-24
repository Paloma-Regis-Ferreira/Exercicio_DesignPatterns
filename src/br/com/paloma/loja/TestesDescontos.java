package br.com.paloma.loja;

import br.com.paloma.loja.desconto.CalculadoraDeDescontos;
import br.com.paloma.loja.imposto.CalculadoraDeImpostos;
import br.com.paloma.loja.imposto.ICMS;
import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    //strategy visa resolver a existência de diversos algoritmos para uma ação, resultando na possibilidade de vários ifs.

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("501"), 6);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(orcamento2));
    }
}
