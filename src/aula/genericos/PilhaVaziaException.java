package aula.genericos;

public class PilhaVaziaException extends RuntimeException{
    public PilhaVaziaException(){
        super("A pilha se encontra vazia");
    }
}
