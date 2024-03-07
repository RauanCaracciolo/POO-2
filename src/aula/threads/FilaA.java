package aula.threads;

import java.util.Arrays;
import java.util.Random;

public class FilaA {
    private int[] vetor;
    private int indice;
    private final Random gerador;
    public FilaA(int tamanho){
        vetor = new int[tamanho];
        indice = 0;

        gerador = new Random();
    }
    public void add(int valor){
        int i = indice;

        try {
            Thread.sleep(gerador.nextInt(500));
        }catch (InterruptedException ex){
            System.out.println("A Thread foi interrompida(terminada) por exceção.");
            ex.printStackTrace();
        }
        vetor[i] = valor;
        System.out.println(Thread.currentThread().getName() + " escreveu o valor " + valor + " na posição i " + i );
        indice++;
        System.out.println("O indice foi incrementado para " + indice + "\n");
    }
    @Override
    public String toString(){
        return "Fila " + Arrays.toString(vetor);
    }
}
