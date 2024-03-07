package aula.threads;

public class EscritorFilaB implements Runnable{

    private FilaB fila;
    private int valorInicial;
    public EscritorFilaB(FilaB fila, int valorInicial){
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
