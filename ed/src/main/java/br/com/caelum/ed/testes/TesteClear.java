package br.com.caelum.ed.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.classes.Vetor;

public class TesteClear {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Isa");
        a2.setNome("Benjamin");
        a3.setNome("Garcia");


        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);

        System.out.println(lista.tamanho());

        lista.clear();

        System.out.println(lista.tamanho());

    }
}
