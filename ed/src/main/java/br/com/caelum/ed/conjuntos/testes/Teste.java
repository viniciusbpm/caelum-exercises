package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class Teste {
    public static void main(String[] args){
        ConjuntoEspalhamento conjuntoEspalhamento = new ConjuntoEspalhamento();

        conjuntoEspalhamento.adiciona("palavra");
        conjuntoEspalhamento.adiciona("computador");
        conjuntoEspalhamento.adiciona("apostila");
        conjuntoEspalhamento.adiciona("instrutor");
        conjuntoEspalhamento.adiciona("mesa");
        conjuntoEspalhamento.adiciona("telefone");

        if(!conjuntoEspalhamento.contem("apostila")){
            System.out.println("Erro: não tem a palavra: apostila");
        }

        conjuntoEspalhamento.remove("apostila");

        if(conjuntoEspalhamento.contem("apostila")){
            System.out.println("Erro: tem a palavra: apostila");
        }

        if(conjuntoEspalhamento.tamanho() != 5){
            System.out.println("Erro: o tamanho do conjunto deveria ser 5");
        }

    }
}
