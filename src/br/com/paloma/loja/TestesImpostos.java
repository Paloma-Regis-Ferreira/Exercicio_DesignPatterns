package br.com.paloma.loja;

import br.com.paloma.loja.imposto.CalculadoraDeImpostos;
import br.com.paloma.loja.imposto.ICMS;
import br.com.paloma.loja.imposto.ISS;
import br.com.paloma.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    //strategy visa resolver a existência de diversos algoritmos para uma ação, resultando na possibilidade de vários ifs.

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
