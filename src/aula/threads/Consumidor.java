package aula.threads;

public class Consumidor implements Runnable{
    private Buffer buffer;

    public Consumidor(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        try {
            for(int i = 1; i <= 10; i++){
                buffer.get();
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
