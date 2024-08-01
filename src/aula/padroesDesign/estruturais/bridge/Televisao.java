package aula.padroesDesign.estruturais.bridge;

public class Televisao implements Dispositivo{
    private boolean ligado;
    private int volume;
    private int canal;

    public  Televisao(){
        this.ligado = false;
        setVolume(0);
        setCanal(1);
    }
    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public int getCanal() {
        return this.canal;
    }
}
