package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteDesempenho {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        ConjuntoEspalhamento conjuntoEspalhamento = new ConjuntoEspalhamento();

        for(int i = 0; i < 50000; i++){
            conjuntoEspalhamento.adiciona("palavra " + i);
        }

        for(int i = 0; i < 50000; i++){
            conjuntoEspalhamento.contem("palavra " + i);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo: " + (fim - inicio) / 1000.0);
    }
}
