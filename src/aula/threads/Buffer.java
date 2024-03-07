package aula.threads;

public class Buffer {
    private int valor;
    private boolean ocupado;

    public Buffer(){
        valor = -1;
        ocupado = false;
    }
    public synchronized void set(int valor) throws InterruptedException{
        while (ocupado){
            wait();
        }
        this.valor = valor;
        ocupado = true;
        notifyAll();
    }
    public synchronized int get() throws  InterruptedException{
        while (!ocupado){
            wait();
        }
        ocupado = false;
        notifyAll();
        return valor;
    }
}
