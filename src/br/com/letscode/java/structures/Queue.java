package br.com.letscode.java.structures;

import br.com.letscode.java.Pessoa;

public class Queue implements EstruturaDados{
    private No inicio;
    private No fim;

    private static class No {
        private Pessoa dado;
        private No proximo;

        public No(Pessoa pessoa) {
            this.dado = pessoa;
        }

        public Pessoa getDado() {
            return dado;
        }

        public void setDado(Pessoa dado) {
            this.dado = dado;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
        }

    public Queue() {
            inicio = null;
            fim = null;
        }

     public void dequeue (){
         if (this.inicio == null){
             System.out.println("Fila vazia.");
         } else if (inicio == fim){
             this.inicio = null;
             this.fim = null;
         } else {
             System.out.println("== " + inicio.getDado() + " removido da fila. ==");
             this.inicio = inicio.getProximo();
         }
     }

     public void peekFirst (){
        if(this.inicio == null){
            System.err.println("A fila está vazia.");
        } else {
            System.out.println("O primeiro da fila é: " + inicio.getDado());
        }
     }

     public void peekLast (){
        if (this.inicio == null){
            System.err.println("A fila está vazia.");
        } else {
            System.out.println("O último da fila é: " + fim.getDado());
        }
     }

    //Enqueue
    @Override
    public void adicionar(Pessoa pessoa) {
        No novaPessoa = new No(pessoa);
        if (inicio == null) {
            inicio = novaPessoa;
            fim = novaPessoa;
            novaPessoa.setProximo(null);
        } else {
            fim.setProximo(novaPessoa);
            novaPessoa.setProximo(null);
            fim = novaPessoa;
        }
    }


    @Override
    public void buscar(String nome) {
        System.out.println("== Resultado da busca para [" + nome + "] ==");
        No elemento = this.inicio;
        while (elemento != null){
            Pessoa pessoa = elemento.getDado();
            if (pessoa.getNome().equalsIgnoreCase(nome)){
                System.out.println(pessoa);
            }
            elemento = elemento.getProximo();
        }
        System.out.println("========================================");
    }


    @Override
    public void remover(Pessoa pessoa) {
        if (this.inicio == null){
            System.err.println("A fila está vazia.");
        } else if (inicio.getDado().equals(pessoa)){
            System.out.println("== " + inicio.getDado() + " removido da fila. ==");
            this.inicio = inicio.getProximo();
        } else {
            System.out.println("Impossível desenfilar.");
        }
    }

    @Override
    public void remover(int index) {
        if (this.inicio == null){
            System.err.println("A fila está vazia.");
        } else if (this.inicio.getDado() == this.getPessoa(index)){
            System.out.println("== " + inicio.getDado() + " removido da fila. ==");
            this.inicio = inicio.getProximo();
        } else {
            System.out.println("Impossível desenfilar.");
        }
    }

    @Override
    public void listarTodos() {
        System.out.println("Lista de pessoas na fila.");
        No elemento = this.inicio;
        while (elemento != null) {
            System.out.println(elemento.getDado());
            elemento = elemento.getProximo();
        }
        System.out.println("========================================");
    }

    @Override
    public Pessoa getPessoa(int index) {
        int i = 0;
        No elemento = this.inicio;
        while (elemento != null){
            if (i++ == index){
                return elemento.getDado();
            }
            elemento = elemento.getProximo();
        }
        return null;
    }
}
