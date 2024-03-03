package br.com.caelum.ed.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.classes.Vetor;

import java.util.ArrayList;
import java.util.Vector;

public class TesteAdicionarAlunosEmVetorString {
    public static void main(String[] args){
        ArrayList<String> vetor = new ArrayList<>();

        vetor.add("Ubots");
        vetor.add("Teste jamais visto");

        Aluno aluno = new Aluno();
        aluno.setNome("Isa");

        vetor.add(String.valueOf(aluno));

        System.out.println(vetor);
    }
}
