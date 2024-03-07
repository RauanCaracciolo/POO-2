package aula.threads;

public class Produtor implements Runnable{
    private Buffer buffer;
    public Produtor(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run(){
        try {
            for(int i = 1; i <= 10; i++){
                buffer.set(i);
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
