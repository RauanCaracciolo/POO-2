package aula.threads;

import java.util.Random;

public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("Criando as Threads");
        Thread thread1 = new Thread(new Imprimir("Tarefa 1"));
        Thread thread2 = new Thread(new Imprimir("Tarefa 2"));
        Thread thread3 = new Thread(new Imprimir("Tarefa 3"));


        System.out.println("Threas criadas. Inicializando Threads.");
        thread1.start(); // Abre outra linha de execução
        thread2.start();
        thread3.start();

        System.out.println("Threas inicializadas. Termino do Main");
    }
}
