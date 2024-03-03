package br.com.caelum.ed.classes;

import java.util.Arrays;

public class Vetor {
    private Object[] objetos = new Object[100000];

    private int totalObjetos = 0;

    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        this.objetos[this.totalObjetos] = aluno;
        this.totalObjetos++;
    }

    public void adiciona(int posicao, Object objeto){
        this.garanteEspaco();
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = this.totalObjetos - 1; i >= posicao; i-=1){
            this.objetos[i + 1] = this.objetos[i];
        }

        this.objetos[posicao] = objeto;
        this.totalObjetos++;
    }

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= this.totalObjetos;
    }

    public Object pega(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.objetos[posicao];
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalObjetos;
    }

    public void remove(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.totalObjetos - 1; i++){
            this.objetos[i] = this.objetos[i + 1];
        }

        this.totalObjetos--;
    }

    public void remove(Object objeto){
        int numeroDeObjetosRemovidos = 0;

        for(int i = 0; i < this.totalObjetos; i++){
            if(this.objetos[i].equals(objeto)){
                for (int i2 = i; i2 < this.totalObjetos - 1; i2++){
                    this.objetos[i2] = this.objetos[i2 + 1];
                    numeroDeObjetosRemovidos++;
                }
            }
        }

        this.totalObjetos -= numeroDeObjetosRemovidos;
    }

    public void clear(){
        for(int i = 0; i < this.totalObjetos; i++){
            if(this.objetos[i] == null){
                break;
            }
            this.objetos[i] = null;
        }
        this.totalObjetos = 0;
    }

    public boolean contem(Object objeto){
        for (int i = 0; i < this.totalObjetos; i++){
            if(objeto == this.objetos[i]){
                return true;
            }
        }

        return false;
    }

    public int tamanho(){
        return this.totalObjetos;
    }

    public String toString(){
        if(this.totalObjetos == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalObjetos - 1; i++){
            builder.append(this.objetos[i]);
            builder.append(", ");
        }

        builder.append(this.objetos[this.totalObjetos - 1]);
        builder.append("]");

        return builder.toString();
    }

    private void garanteEspaco(){
        if(this.totalObjetos == this.objetos.length){
            Object[] novaArray = new Object[this.objetos.length * 2];
            for(int i = 0; i < this.objetos.length; i++){
                novaArray[i] = this.objetos[i];
            }
            this.objetos = novaArray;
        }
    }

    public int indexOf(Object objeto){
        for(int i = 0; i < this.totalObjetos; i++){
            if(this.objetos[i].equals(objeto)){
                return i;
            }
        }
        throw new IllegalArgumentException("Objeto não encontrado");
    }

    public int lastIndexOf(Object objeto){
        int indexObjeto = -1;

        for(int i = 0; i < this.totalObjetos; i++){
            if(this.objetos[i].equals(objeto)){
                indexObjeto = i;
            }
        }

        if(indexObjeto == -1 ){
            throw new IllegalArgumentException("Objeto não encontrado");
        }

        return indexObjeto;
    }



}
