package exercicios.ex7;

public class Produtor implements Runnable{
    private Buffer buffer;
    int[] valores;

    public Produtor(Buffer buffer){
        this.buffer = buffer;
        valores = new int[buffer.getTamanho()];
    }
    @Override
    public void run(){
        try {
            buffer.set();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
