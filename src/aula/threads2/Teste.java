package aula.threads2;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList vetor = new ArrayList();
        // produzir enquanto vetor.size() <= tamanho do buffer
        vetor.add(5);
        vetor.add(13);
        vetor.add(4);
        vetor.add(25);
        vetor.add(13);
        System.out.println(vetor);
    }
}
