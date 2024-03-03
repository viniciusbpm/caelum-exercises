package br.com.caelum.ed.listasligadas;

public class ListaLigada {
    private Celula primeira;
    private Celula ultima;
    private int totalElementos;

    public void adiciona(Object elemento) {
        if(this.totalElementos == 0){
            this.adicionaNoComeco(elemento);
        }
        else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if(posicao == 0){
            this.adicionaNoComeco(elemento);
        } else if(posicao == this.totalElementos){
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totalElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalElementos;
    }

    private Celula pegaCelula(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição não existe");
        }

        Celula atual = this.primeira;
        for(int i = 0; i < posicao; i++){
            atual = atual.getProxima();
        }
        return atual;
    }

    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao){
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição não existe");
        }

        if(posicao == 0){
            this.removeDoComeco();
        } else if(posicao == this.totalElementos - 1){
            this.removeDoFim();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProxima();
            Celula proxima = atual.getProxima();

            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);

            this.totalElementos--;
        }
    }

    public int tamanho() {
        return this.totalElementos;
    }

    public boolean contem(Object elemento) {
        Celula atual = this.primeira;

        while (atual != null){
            if(atual.getElemento().equals(elemento)){
                return true;
            }
            atual = atual.getProxima();
        }

        return false;

    }

    public void adicionaNoComeco(Object  elemento){
        if(this.totalElementos == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }

        this.totalElementos++;
    }

    public void removeDoComeco(){
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posição não existe");
        }

        this.primeira = this.primeira.getProxima();
        this.totalElementos--;

        if(this.totalElementos == 0){
            this.ultima = null;
        }
    }

    public void removeDoFim(){
        if(!this.posicaoOcupada(this.totalElementos - 1)){
            throw new IllegalArgumentException("Posição não existe");
        }
        if(this.totalElementos == 1){
            this.removeDoComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProxima(null);
            this.ultima = penultima;
            this.totalElementos--;
        }
    }

    public String toString() {
        if(this.totalElementos == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;

        for (int i = 0; i < this.totalElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }

        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
}
