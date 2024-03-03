package br.com.caelum.ed.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.classes.Vetor;

public class TestePegaPorPosicao {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.setNome("Rafael");
        Vetor lista = new Vetor();

        lista.adiciona(a1);

        lista.pega(0);
        lista.pega(1);
        lista.pega(100000000);
    }
}
