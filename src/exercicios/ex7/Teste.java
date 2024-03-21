package exercicios.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Teste {
    public static void main(String[] args) {
        Buffer buffer1 = new Buffer(100);
        Produtor p1 = new Produtor(buffer1);
        Consumidor c1 = new Consumidor(buffer1);
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        executorThreads.execute(p1);
        executorThreads.execute(c1);
        executorThreads.shutdown();
    }
}
