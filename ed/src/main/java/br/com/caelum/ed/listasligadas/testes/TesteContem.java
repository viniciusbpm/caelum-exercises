package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.ListaLigada;

public class TesteContem {
    public static void main(String[] args){
        ListaLigada listaLigada = new ListaLigada();

        listaLigada.adiciona("Rafael");
        listaLigada.adiciona("Paulo");

        System.out.println(listaLigada.contem("Rafael"));
        System.out.println(listaLigada.contem("Camila"));
    }
}
