package br.com.letscode.java.exceptions;

public class IndiceInvalidoException extends RuntimeException {

    public IndiceInvalidoException() {
        super("Posição inválida dentro da estrutura de dados.");
    }
}