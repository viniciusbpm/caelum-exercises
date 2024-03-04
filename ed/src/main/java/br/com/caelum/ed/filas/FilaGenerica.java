package br.com.caelum.ed.filas;

import br.com.caelum.ed.classes.Aluno;

import java.util.LinkedList;
import java.util.List;

public class FilaGenerica {
    private List<Object> objetos = new LinkedList<>();
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
