package aula.threads;

public class EscritorFilaA implements Runnable{

    private FilaA fila;
    private int valorInicial;
    public EscritorFilaA(FilaA fila, int valorInicial){
        this.fila = fila;
        this.valorInicial = valorInicial;

    }
    @Override
    public void run(){
        for(int i =valorInicial; i < valorInicial+3; i++){
            fila.add(i);
        }
    }
}
