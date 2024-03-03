package br.com.caelum.ed.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.classes.Vetor;

public class TesteEstoura {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        for (int i = 0; i < 10; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }
    }
}
