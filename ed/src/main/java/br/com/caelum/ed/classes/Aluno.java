package br.com.caelum.ed.classes;

public class Aluno {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }
}
