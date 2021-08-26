package br.com.letscode.java.structures;

import br.com.letscode.java.exceptions.IndiceInvalidoException;
import br.com.letscode.java.Pessoa;
import br.com.letscode.java.exceptions.PessoaNaoEncontradaException;

public class Stack implements EstruturaDados {
    private int posicaoPilha;
    private Pessoa[] pilha;

    public Stack (){
        this.posicaoPilha = -1;
        int MAX = 10;
        this.pilha = new Pessoa[MAX];
    }

    public boolean pilhaVazia(){
        return this.posicaoPilha == -1;
    }

    public void pop () {
        if (pilhaVazia()){
            System.err.println("A pilha está vazia.");
        } else {
            this.posicaoPilha--;

        }
    }

    public void peek (){
        if (pilhaVazia()){
            System.err.println("A pilha está vazia.");
        } else {
        System.out.println("O topo está ocupado por: " + this.pilha[this.posicaoPilha]);
        }
    }

    //Push
    @Override
    public void adicionar(Pessoa pessoa) {
        this.posicaoPilha++;
        if (this.pilha.length == this.posicaoPilha) {
            Pessoa[] temp = this.pilha;
            this.pilha = new Pessoa[this.posicaoPilha << 1];
            System.arraycopy(temp, 0, this.pilha, 0, this.posicaoPilha);

        }
            this.pilha[this.posicaoPilha] = pessoa;
            System.out.println(pessoa + " adicionado à pilha.");
    }



    @Override
    public void buscar(String nome) {
        System.out.println("== Resultado da busca para [" + nome + "] ==");
            for (int i = 0; i < this.posicaoPilha; i++) {
                if (this.pilha[i].getNome().equalsIgnoreCase(nome)) {
                    System.out.println(this.pilha[i]);
                    System.out.println("=================================");
                    return;
                }
            }
        throw new PessoaNaoEncontradaException();
    }

    @Override
    public void remover(Pessoa pessoa) {
        if (pilhaVazia()){
            System.err.println("A pilha está vazia.");
        } else if (this.pilha[posicaoPilha].equals(pessoa)) {
            System.out.println("== " + this.pilha[this.posicaoPilha] + " removido da pilha. ==");
            this.posicaoPilha--;
        } else {
            System.out.println("Impossível desempilhar.");
        }
    }


    @Override
    public void remover(int index) {
         if (pilhaVazia()) {
            System.err.println("A pilha está vazia.");
         } else if (this.pilha[this.posicaoPilha] == this.getPessoa(index)){
            System.out.println("== " + this.pilha[this.posicaoPilha] + " removido da pilha. ==");
            this.posicaoPilha--;
        } else {
            System.out.println("Impossível desempilhar.");
        }

    }

    @Override
    public void listarTodos() {
        System.out.println("=================================");
        if (pilhaVazia()){
            System.err.println("A pilha está vazia.");
        } else {
            System.out.printf("Lista de Pessoas contidas na pilha: %d/%d.\n", this.posicaoPilha + 1, this.pilha.length);
            for (int i = 0; i <= this.posicaoPilha; i++) {
                System.out.println(this.pilha[i]);
            }
        }
        System.out.println("=================================");

    }

    @Override
    public Pessoa getPessoa(int index) {
        if (index >= 0 && index <= this.posicaoPilha) {
            return this.pilha[index];
        }
        throw new IndiceInvalidoException();
    }

}

