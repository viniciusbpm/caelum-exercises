package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

public class FilaParametrizada<T> {
    private List<T> objetos = new LinkedList<>();
    public void insere(T t){
        this.objetos.add(t);
    }

    public T remove(){
        return this.objetos.remove(0);
    }

    public boolean vazia(){
        return objetos.isEmpty();
    }
}
