package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

import java.util.List;

public class TesteRemove {
    public static void main(String[] args){
        ConjuntoEspalhamento conjuntoEspalhamento = new ConjuntoEspalhamento();
        conjuntoEspalhamento.adiciona("Rafael");
        conjuntoEspalhamento.adiciona("Ana");
        conjuntoEspalhamento.adiciona("Paulo");

        List<String> palavras = conjuntoEspalhamento.pegaTodas();

        System.out.println("Antes de remover");

        for(String palavra : palavras){
            System.out.println(palavra);
        }

        conjuntoEspalhamento.remove("Rafael");

        palavras = conjuntoEspalhamento.pegaTodas();

        System.out.println("Depois de remover");

        for(String palavra : palavras){
            System.out.println(palavra);
        }


    }
}
