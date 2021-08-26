package br.com.letscode.java.exceptions;

public class PessoaNaoEncontradaException extends RuntimeException {

    public PessoaNaoEncontradaException() {
        super("Pessoa não encontrada.");
    }
}