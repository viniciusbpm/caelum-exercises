package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.ListaLigada;

public class TesteRemovePorPosicao {
    public static void main(String[] args){
        ListaLigada listaLigada = new ListaLigada();

        listaLigada.adiciona("Rafael");
        listaLigada.adiciona("Paulo");
        listaLigada.adiciona("Camila");

        listaLigada.remove(1);

        System.out.println(listaLigada);
    }
}
