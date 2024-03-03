package br.com.caelum.ed.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.classes.Vetor;

public class TesteRemoveTodasInstanciasDoObjeto {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();


        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a2);
        lista.adiciona(a2);

        System.out.println(lista);

        lista.remove(a2);

        System.out.println(lista);
    }
}
