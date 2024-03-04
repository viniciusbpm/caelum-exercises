package br.com.caelum.ed.filas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FilaArrayList {
    private List<Object> objetos = new ArrayList<>();
    public void insere(Object objeto){
        this.objetos.add(objeto);
    }

    public Object remove(){
        return this.objetos.remove(0);
    }

    public boolean vazia(){
        return objetos.isEmpty();
    }
}
