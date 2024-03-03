package br.com.caelum.ed.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.classes.Vetor;

import java.util.ArrayList;
import java.util.Vector;

public class TesteApiJava {
    public static void main(String[] args){
        Vetor vetor = new Vetor();

        System.out.println(vetor.tamanho());

        for(int i = 0; i < 1000; i++){
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }

        System.out.println(vetor.tamanho());

        Vector<Object> vetor2 = new Vector<>();

        System.out.println(vetor2.size());

        for (int i = 0; i < vetor.tamanho(); i++){
            vetor2.add(vetor.pega(i));
        }

        System.out.println(vetor2.size());

        ArrayList<Object> vetor3 = new ArrayList<>();

        System.out.println(vetor3.size());

        for (int i = 0; i < vetor.tamanho(); i++){
            vetor3.add(vetor2.get(i));
        }

        System.out.println(vetor3.size());
    }
}
