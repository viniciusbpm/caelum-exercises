package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento<C, V> {
    private List<List<Associacao<C, V>>> tabela = new ArrayList<>();

    public MapaEspalhamento(){
        for (int i = 0; i < 100; i++){
            this.tabela.add(new LinkedList<>());
        }
    }

    private int calculaIndiceTabela(C chave){
        return Math.abs(chave.hashCode()) % this.tabela.size();
    }

    public boolean contemChave(C chave){
        int indice = this.calculaIndiceTabela(chave);
        List<Associacao<C, V>> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            Associacao<C, V> associacao = lista.get(i);
            if(associacao.getChave().equals(chave)){
                return true;
            }
        }
        return false;
    }

    public void remove(C chave){
        int indice = this.calculaIndiceTabela(chave);
        List<Associacao<C, V>> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            Associacao<C, V> associacao = lista.get(i);
            if(associacao.getChave().equals(chave)){
                lista.remove(i);
                return;
            }
        }

        throw new IllegalArgumentException("A chave não existe");
    }

    public void adiciona(C chave, V valor){
        if(this.contemChave(chave)){
            this.remove(chave);
        }

        int indice = calculaIndiceTabela(chave);
        List<Associacao<C, V>> lista = this.tabela.get(indice);
        lista.add(new Associacao<>(chave, valor));
    }

    public V pega(C chave){
        int indice = calculaIndiceTabela(chave);
        List<Associacao<C, V>> lista = this.tabela.get(indice);

        for(int i = 0; i < lista.size(); i++){
            Associacao<C, V> associacao = lista.get(i);
            if(associacao.getChave().equals(chave)){
                return associacao.getValor();
            }
        }

        throw new IllegalArgumentException("A chave não existe");
    }

    private List<Associacao<C, V>> pegaTodas() {
        ArrayList<Associacao<C, V>> associacoes = new ArrayList<>();

        for (List<Associacao<C, V>> lista : this.tabela) {
            associacoes.addAll(lista);
        }
        return associacoes;
    }

    @Override
    public String toString() {
        return this.pegaTodas().toString();
    }
}
