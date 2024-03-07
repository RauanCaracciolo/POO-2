package aula.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exemplo03 {
    public static void main(String[] args) {
        FilaA fila = new FilaA(6);
        EscritorFilaA escritor1 = new EscritorFilaA(fila, 1);
        EscritorFilaA escritor2 = new EscritorFilaA(fila,11);
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        executorThreads.execute(escritor1);
        executorThreads.execute(escritor2);
        executorThreads.shutdown();
        try {
            executorThreads.awaitTermination(3, TimeUnit.SECONDS);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println(fila);
    }
}
