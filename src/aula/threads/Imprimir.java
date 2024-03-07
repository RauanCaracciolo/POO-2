package aula.threads;

import java.util.Random;

public class Imprimir implements Runnable{

    private final String nomeTarefa;
    private final int delay;
    private final static Random gerador = new Random();

    Imprimir(String nomeTarefa){
        this.nomeTarefa = nomeTarefa;
        this.delay = gerador.nextInt(5000);
    }
    @Override
    public void run(){
        System.out.println(nomeTarefa + " indo dormir por " + delay/1000.0 + "segundos.");
        //dormir
        try {
            Thread.sleep(delay);
        }catch (InterruptedException ex){
            System.out.println("A Thread foi interrompida(terminada) por exceção.");
        }
        System.out.println(nomeTarefa + " teminou de dormir");
    }

}
