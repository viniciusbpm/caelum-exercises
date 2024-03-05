package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamentoParametrizado<T> {
    private List<List<T>> tabela = new ArrayList<>();
    private int tamanho = 0;

    public ConjuntoEspalhamentoParametrizado(){
        for (int i = 0; i < 26; i++){
            LinkedList<T> lista = new LinkedList<>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(T objeto){
        int codigoDeEspalhamento = objeto.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % this.tabela.size();
    }

    public void adiciona(T objeto){
        this.verificaCarga();
        if(!this.contem(objeto)){
            int indice = this.calculaIndiceDaTabela(objeto);
            List<T> lista = this.tabela.get(indice);
            lista.add(objeto);
            tamanho++;
        }
    }

    public void remove(T objeto){
        this.verificaCarga();
        if(this.contem(objeto)){
            int indice = this.calculaIndiceDaTabela(objeto);
            List<T> lista = this.tabela.get(indice);
            lista.remove(objeto);
            tamanho--;
        }
    }

    public boolean contem(T objeto){
        int indice = this.calculaIndiceDaTabela(objeto);
        List<T> lista = this.tabela.get(indice);

        return lista.contains(objeto);
    }

    public List<T> pegaTodos(){
        List<T> objetos = new ArrayList<>();

        for(int i = 0; i < this.tabela.size(); i++){
            objetos.addAll(this.tabela.get(i));
        }

        return objetos;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public void imprimeTabela(){
        for (List<T> lista : this.tabela){
            System.out.println("[");
            for(int i = 0; i < lista.size(); i++){
                System.out.println("*");
            }
            System.out.println("]");
        }
    }

    private void redimensionaTabela(int novaCapacidade){
        List<T> objetos = this.pegaTodos();
        this.tabela.clear();

        for(int i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<>());
        }

        for(T objeto : objetos){
            this.adiciona(objeto);
        }
    }

    private void verificaCarga(){
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;

        if(carga > 0.75){
            this.redimensionaTabela(capacidade * 2);
        } else if(carga < 0.25){
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }
}
