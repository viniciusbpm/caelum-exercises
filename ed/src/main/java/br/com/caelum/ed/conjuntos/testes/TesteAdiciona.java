package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

import java.util.List;

public class TesteAdiciona {
    public static void main(String[] args){
        ConjuntoEspalhamento conjuntoEspalhamento = new ConjuntoEspalhamento();
        conjuntoEspalhamento.adiciona("Rafael");
        conjuntoEspalhamento.adiciona("Ana");
        conjuntoEspalhamento.adiciona("Paulo");

        List<String> palavras = conjuntoEspalhamento.pegaTodas();

        for(String palavra : palavras){
            System.out.println(palavra);
        }
    }
}
