package aula.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exemplo04 {
    public static void main(String[] args) {
        FilaB fila = new FilaB(6);
        EscritorFilaB escritor1 = new EscritorFilaB(fila, 1);
        EscritorFilaB escritor2 = new EscritorFilaB(fila,11);
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
