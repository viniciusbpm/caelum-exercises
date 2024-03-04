package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaGenerica;
import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class TestePilhaParametrizada {
    public static void main(String[] args) {
        PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<>();
        Peca peca = new Peca();

        pilhaDePecas.insere(peca);

        Object pecaRemovida = pilhaDePecas.remove();

        if(peca != pecaRemovida){
            System.out.println("Erro: a peça removida não é igual " +
                    " a que foi inserida");
        }

        if (!pilhaDePecas.vazia()) {
            System.out.println("Erro: A pilha não está vazia");
        }

        PilhaParametrizada<String> pilhaDeString =
                new PilhaParametrizada<>();

        pilhaDeString.insere("Manoel");
        pilhaDeString.insere("Zuleide");

        System.out.println(pilhaDeString.remove());
        System.out.println(pilhaDeString.remove());
    }
}
