package br.com.paloma.loja;

public class DomainException extends RuntimeException{

    public DomainException(String mensagem){
        super(mensagem);
    }
}
