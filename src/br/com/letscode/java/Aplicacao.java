package br.com.letscode.java;

import br.com.letscode.java.structures.LinkedList;
import br.com.letscode.java.structures.Queue;
import br.com.letscode.java.structures.Stack;

public class Aplicacao {

    public static void main(String[] args) {
        System.out.println(">>> demonstração com Queue <<<");
        testeQueue();
        
        System.out.println(">>> demonstração com Stack <<<");
        testeStack();

        System.out.println(">>> demonstração LinkedList <<<");
        testeLinked();
    }

    private static void testeQueue() {
        Queue list = new Queue();
        var pessoa1 = new Pessoa("Jessé", "jesse@email.com.br");
        var pessoa2 = new Pessoa("Matheus", "matheus@email.com.br");
        var pessoa3 = new Pessoa("Cinthia", "cinthia@email.com.br");
        var pessoa4 = new Pessoa("Nicolas", "nicolas@email.com.br");
        var pessoa5 = new Pessoa("Larissa", "larissa@email.com.br");
        list.adicionar(pessoa1);
        list.adicionar(pessoa2);
        list.adicionar(pessoa3);
        list.adicionar(pessoa4);
        list.adicionar(pessoa5);
        list.listarTodos();
        list.dequeue();
        list.listarTodos();
        list.buscar("Lúcio");
        list.remover(pessoa3);
        list.remover(3);
        list.remover(pessoa2);
        list.listarTodos();
        list.peekFirst();
        list.peekLast();

    }

    private static void testeStack() {
        Stack list = new Stack();
        var pessoa1 = new Pessoa("Jessé", "jesse@email.com.br");
        var pessoa2 = new Pessoa("Matheus", "matheus@email.com.br");
        var pessoa3 = new Pessoa("Cinthia", "cinthia@email.com.br");
        var pessoa4 = new Pessoa("Nicolas", "nicolas@email.com.br");
        var pessoa5 = new Pessoa("Larissa", "larissa@email.com.br");
        list.peek();
        list.pop();
        list.remover(0);
        list.remover(pessoa1);
        list.adicionar(pessoa1);
        list.adicionar(pessoa2);
        list.adicionar(pessoa3);
        list.adicionar(pessoa4);
        list.adicionar(pessoa5);
        list.adicionar(pessoa1);
        list.adicionar(pessoa2);
        list.adicionar(pessoa3);
        list.adicionar(pessoa4);
        list.adicionar(pessoa5);
        list.adicionar(pessoa1);
        list.pop();
        list.peek();
        list.remover(0);
        list.remover(pessoa5);
        list.remover(8);
        list.listarTodos();
    }

    public static void testeLinked() {
        LinkedList list = new LinkedList();
        var pessoa1 = new Pessoa("Jessé", "jesse@email.com.br");
        var pessoa2 = new Pessoa("Matheus", "matheus@email.com.br");
        var pessoa3 = new Pessoa("Cinthia", "cinthia@email.com.br");
        var pessoa4 = new Pessoa("Larissa", "larissa@email.com.br");
        list.adicionar(pessoa1);
        list.adicionar(pessoa2);
        list.adicionar(pessoa3);
        list.listarTodos();
        list.remover(pessoa2);
        list.listarTodos();
        list.adicionarInicio(pessoa2);
        list.listarTodos();
        list.adicionarFim(pessoa4);
        list.listarTodos();
    }

}