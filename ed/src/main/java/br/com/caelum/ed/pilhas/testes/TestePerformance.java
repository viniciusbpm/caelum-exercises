package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaArrayList;
import br.com.caelum.ed.pilhas.PilhaGenerica;

public class TestePerformance {
    public static void main(String[] args) {
        PilhaGenerica pilhaGenerica = new PilhaGenerica();
        PilhaArrayList pilhaArrayList = new PilhaArrayList();

        long inicioGenerica = System.currentTimeMillis();

        for(int i = 0; i < 30000; i++){
            Peca peca = new Peca();
            pilhaGenerica.insere(peca);
        }

        long fimGenerica = System.currentTimeMillis();

        long inicioArrayList = System.currentTimeMillis();

        for(int i = 0; i < 30000; i++){
            Peca peca = new Peca();
            pilhaArrayList.insere(peca);
        }

        long fimArrayList = System.currentTimeMillis();

        double tempoGenerica = (fimGenerica - inicioGenerica) / 1000.0;
        double tempoArrayList = (fimArrayList - inicioArrayList) / 1000.0;

        System.out.println("Tempo inserir LinkedList = " + tempoGenerica);
        System.out.println("Tempo inserir ArrayList = " + tempoArrayList);

        long inicioRemoveGenerica = System.currentTimeMillis();

        for(int i = 0; i < 30000; i++){
            pilhaGenerica.remove();
        }

        long fimRemoveGenerica = System.currentTimeMillis();

        long inicioRemoveArrayList = System.currentTimeMillis();

        for(int i = 0; i < 30000; i++){
            pilhaArrayList.remove();
        }

        long fimRemoveArrayList = System.currentTimeMillis();

        double tempoRemoveGenerica = (fimRemoveGenerica - inicioRemoveGenerica) / 1000.0;
        double tempoRemoveArrayList = (fimRemoveArrayList - inicioRemoveArrayList) / 1000.0;

        System.out.println("Tempo remover LinkedList = " + tempoRemoveGenerica);
        System.out.println("Tempo remover ArrayList = " + tempoRemoveArrayList);
    }
}
