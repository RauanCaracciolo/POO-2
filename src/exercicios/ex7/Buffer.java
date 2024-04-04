package exercicios.ex7;
import java.util.ArrayList;

public class Buffer {
    public int tamanho;
    private ArrayList valores;
    private boolean cheio;
    private boolean vazio;

    public Buffer(int tamanho){
        this.tamanho = tamanho;
        valores = new ArrayList();
        cheio = false;
        vazio = true;
    }
    public synchronized void set() throws InterruptedException{
        while (cheio){
            System.out.println("Esperando vazio");
            wait();
        }
        for(int i = 0; i < tamanho; i++){
            this.valores.add(i);
            vazio = false;
            notifyAll();
        }
        System.out.println("cheio");
        cheio = true;
        notifyAll();
    }
    public synchronized ArrayList get() throws  InterruptedException{
        while (!cheio){
            System.out.println("Esperando ");
            wait();
        }
        ArrayList temp = valores;
        for (int i = tamanho - 1; i != 0; i--){
            valores.remove(i);
            System.out.println(i*-1);
            cheio = false;
            notifyAll();
        }
        System.out.println("Esvaziado");
        vazio = true;
        notifyAll();
        return valores;
    }
    public int getTamanho(){
        return tamanho;
    }
}
