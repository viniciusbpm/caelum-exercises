package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.filas.Fila;
import br.com.caelum.ed.filas.FilaGenerica;

public class TesteFilaGenerica {
    public static void main(String[] args){
        FilaGenerica filaDeAlunos = new FilaGenerica();

        Aluno aluno = new Aluno();
        filaDeAlunos.insere(aluno);

        Object alunoRemovido = filaDeAlunos.remove();

        if (aluno != alunoRemovido) {
            System.out.println("Erro: o aluno removido não é igual ao que foi inserido");
        }

        if(!filaDeAlunos.vazia()){
            System.out.println("Erro: A fila não está vazia");
        }


    }
}
