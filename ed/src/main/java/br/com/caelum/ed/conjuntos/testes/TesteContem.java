package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteContem {
    public static void main(String[] args){
        ConjuntoEspalhamento conjuntoEspalhamento = new ConjuntoEspalhamento();

        conjuntoEspalhamento.adiciona("Olá");
        conjuntoEspalhamento.adiciona("Mundo");

        System.out.println(conjuntoEspalhamento.contem("Olá"));
        System.out.println(conjuntoEspalhamento.contem("Mundo"));
        System.out.println(conjuntoEspalhamento.contem("Rafael"));
        System.out.println(conjuntoEspalhamento.contem("Paulo"));
    }
}
