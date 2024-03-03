package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.ListaLigada;

public class TesteAdicionaNoComeco {
    public static void main(String[] args){
        ListaLigada listaLigada = new ListaLigada();

        listaLigada.adicionaNoComeco("Rafael");
        listaLigada.adicionaNoComeco("Paulo");

        System.out.println(listaLigada);
    }
}
