package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamentoGenerico;

import java.util.HashSet;

public class TesteConjuntoGenerico {
    public static void main(String[] args){
        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");

        conjunto.adiciona("Paulo");
        
        System.out.println(conjunto.pegaTodos());
    }
}
