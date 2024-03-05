package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteTamanho {
    public static void main(String[] args){
        ConjuntoEspalhamento conjuntoEspalhamento = new ConjuntoEspalhamento();

        System.out.println(conjuntoEspalhamento.tamanho());

        conjuntoEspalhamento.adiciona("Rafael");
        conjuntoEspalhamento.adiciona("Ana");
        conjuntoEspalhamento.adiciona("Paulo");

        System.out.println(conjuntoEspalhamento.tamanho());

        conjuntoEspalhamento.remove("Ana");

        System.out.println(conjuntoEspalhamento.tamanho());
    }
}
