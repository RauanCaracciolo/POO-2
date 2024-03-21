package aula.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Joao");
        fila.offer("Maria");
        fila.offer("Jose");
        fila.offer("Pedro");
        fila.offer("Roberto");
        fila.offer("Mauro");
        System.out.println(fila);

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
            if (!fila.isEmpty()){
                System.out.println(fila.peek() + "\n");
            }else {
                System.out.println("Não há elemento para ser retirado");
            }
        }
    }
}
