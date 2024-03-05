package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamentoGenerico {
    private List<List<Object>> tabela = new ArrayList<>();
    private int tamanho = 0;

    public ConjuntoEspalhamentoGenerico(){
        for (int i = 0; i < 26; i++){
            LinkedList<Object> lista = new LinkedList<>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(Object objeto){
        int codigoDeEspalhamento = objeto.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % this.tabela.size();
    }

    public void adiciona(Object objeto){
        this.verificaCarga();
        if(!this.contem(objeto)){
            int indice = this.calculaIndiceDaTabela(objeto);
            List<Object> lista = this.tabela.get(indice);
            lista.add(objeto);
            tamanho++;
        }
    }

    public void remove(Object objeto){
        this.verificaCarga();
        if(this.contem(objeto)){
            int indice = this.calculaIndiceDaTabela(objeto);
            List<Object> lista = this.tabela.get(indice);
            lista.remove(objeto);
            tamanho--;
        }
    }

    public boolean contem(Object objeto){
        int indice = this.calculaIndiceDaTabela(objeto);
        List<Object> lista = this.tabela.get(indice);

        return lista.contains(objeto);
    }

    public List<Object> pegaTodos(){
        List<Object> objetos = new ArrayList<>();

        for(int i = 0; i < this.tabela.size(); i++){
            objetos.addAll(this.tabela.get(i));
        }

        return objetos;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public void imprimeTabela(){
        for (List<Object> lista : this.tabela){
            System.out.println("[");
            for(int i = 0; i < lista.size(); i++){
                System.out.println("*");
            }
            System.out.println("]");
        }
    }

    private void redimensionaTabela(int novaCapacidade){
        List<Object> objetos = this.pegaTodos();
        this.tabela.clear();

        for(int i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<>());
        }

        for(Object objeto : objetos){
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
