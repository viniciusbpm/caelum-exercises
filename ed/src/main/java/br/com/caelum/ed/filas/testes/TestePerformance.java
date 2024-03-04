package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.filas.FilaArrayList;
import br.com.caelum.ed.filas.FilaGenerica;
import br.com.caelum.ed.filas.FilaParametrizada;

public class TestePerformance {
    public static void main(String[] args){
        FilaGenerica filaGenerica = new FilaGenerica();
        FilaArrayList filaArrayList = new FilaArrayList();

        long inicioInsereGenerica = System.currentTimeMillis();

        for(int i = 0; i < 30000; i++){
            Aluno aluno = new Aluno();
            filaGenerica.insere(aluno);
        }

        long fimInsereGenerica = System.currentTimeMillis();

        long inicioRemoveGenerica = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++){
            filaGenerica.remove();
        }

        long fimRemoveGenerica = System.currentTimeMillis();

        long inicioInsereArrayList = System.currentTimeMillis();

        for(int i = 0; i < 30000; i++){
            Aluno aluno = new Aluno();
            filaArrayList.insere(aluno);
        }

        long fimInsereArrayList = System.currentTimeMillis();

        long inicioRemoveArrayList = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++){
            filaArrayList.remove();
        }

        long fimRemoveArrayList = System.currentTimeMillis();

        double tempoInsereGenerica = (fimInsereGenerica - inicioInsereGenerica) / 1000.0;
        double tempoInsereArrayList = (fimInsereArrayList - inicioInsereArrayList) / 1000.0;
        double tempoRemoveGenerica = (fimRemoveGenerica - inicioRemoveGenerica) / 1000.0;
        double tempoRemoveArrayList = (fimRemoveArrayList - inicioRemoveArrayList) / 1000.0;

        System.out.println("Tempo inserir LinkedList = " + tempoInsereGenerica);
        System.out.println("Tempo inserir ArrayList = " + tempoInsereArrayList);
        System.out.println("Tempo remover LinkedList = " + tempoRemoveGenerica);
        System.out.println("Tempo remover ArrayList = " + tempoRemoveArrayList);
    }
}
