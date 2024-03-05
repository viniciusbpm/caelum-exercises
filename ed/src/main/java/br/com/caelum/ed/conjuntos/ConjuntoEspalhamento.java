package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
    private List<List<String>> tabela = new ArrayList<>();
    private int tamanho = 0;

    public ConjuntoEspalhamento(){
        for (int i = 0; i < 26; i++){
            LinkedList<String> lista = new LinkedList<>();
            tabela.add(lista);
        }
    }

    private int calculaIndiceDaTabela(String palavra){
        int codigoDeEspalhamento = this.calculaCodigoEspalhamento(palavra);
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % this.tabela.size();
    }

    private int calculaCodigoEspalhamento(String palavra){
        int codigo = 1;
        for (int i = 0; i < palavra.length(); i++){
            codigo = 31 * codigo + palavra.charAt(i);
        }
        return codigo;
    }


    public void adiciona(String palavra){
        this.verificaCarga();
        if(!this.contem(palavra)){
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
            tamanho++;
        }
    }

    public void remove(String palavra){
        this.verificaCarga();
        if(this.contem(palavra)){
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
            tamanho--;
        }
    }

    public boolean contem(String palavra){
        int indice = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);

        return lista.contains(palavra);
    }

    public List<String> pegaTodas(){
        List<String> palavras = new ArrayList<>();

        for(int i = 0; i < this.tabela.size(); i++){
            palavras.addAll(this.tabela.get(i));
        }

        return palavras;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public void imprimeTabela(){
        for (List<String> lista : this.tabela){
            System.out.println("[");
            for(int i = 0; i < lista.size(); i++){
                System.out.println("*");
            }
            System.out.println("]");
        }
    }

    private void redimensionaTabela(int novaCapacidade){
        List<String> palavras = this.pegaTodas();
        this.tabela.clear();

        for(int i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<>());
        }

        for(String palavra : palavras){
            this.adiciona(palavra);
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
