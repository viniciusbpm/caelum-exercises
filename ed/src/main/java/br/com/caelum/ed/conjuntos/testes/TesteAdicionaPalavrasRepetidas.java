package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteAdicionaPalavrasRepetidas {
    public static void main(String[] args){
        ConjuntoEspalhamento conjuntoEspalhamento = new ConjuntoEspalhamento();
        conjuntoEspalhamento.adiciona("Rafael");
        conjuntoEspalhamento.adiciona("Ana");
        conjuntoEspalhamento.adiciona("Paulo");

        System.out.println(conjuntoEspalhamento.tamanho());

        conjuntoEspalhamento.adiciona("Paulo");
        conjuntoEspalhamento.adiciona("Rafael");
        conjuntoEspalhamento.adiciona("Ana");

        System.out.println(conjuntoEspalhamento.tamanho());
    }
}
