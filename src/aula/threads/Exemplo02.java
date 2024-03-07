package aula.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplo02 {
    public static void main(String[] args) {
        System.out.println("Criando as Threads");
        Imprimir tarefa1 = new Imprimir("Tarefa1");
        Imprimir tarefa2 = new Imprimir("Tarefa2");
        Imprimir tarefa3 = new Imprimir("Tarefa3");

        System.out.println("Threas criadas. Inicializando Threads.");
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        executorThreads.execute(tarefa1);
        executorThreads.execute(tarefa2);
        executorThreads.execute(tarefa3);

        System.out.println("Threas inicializadas. Termino do Main");
        //IMPORTANTE!!!! encerra as threads quando tarefas terminarem, se nao colocar o programa nao para de executar
        executorThreads.shutdown();
    }
}
