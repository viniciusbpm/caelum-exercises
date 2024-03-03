package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.ListaLigada;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args){
        ListaLigada listaLigada = new ListaLigada();
        listaLigada.adiciona("Rafael");
        listaLigada.adiciona(0, "Paulo");
        listaLigada.adiciona(1, "Camila");

        System.out.println(listaLigada);
    }
}
