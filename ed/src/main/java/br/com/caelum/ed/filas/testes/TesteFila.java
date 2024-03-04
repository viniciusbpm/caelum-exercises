package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.classes.Aluno;
import br.com.caelum.ed.filas.Fila;

public class TesteFila {
    public static void main(String[] args){
        Fila fila = new Fila();

        Aluno aluno = new Aluno();
        fila.insere(aluno);

        Aluno alunoRemovido = fila.remove();

        if (aluno != alunoRemovido) {
            System.out.println("Erro: o aluno removido não é igual ao que foi inserido");
        }

        if(!fila.vazia()){
            System.out.println("Erro: A fila não está vazia");
        }


    }
}
