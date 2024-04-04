package aula.genericos;

public class ClasseB {
    public <T> void imprimeVetor(T[] vetor){
        for (T e: vetor){
            System.out.println(e);
        }
    }
}
