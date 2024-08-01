package aula.padroesDesign.estruturais.bridge;

public interface Dispositivo {
    public void ligar();
    public void desligar();
    public boolean estaLigado();
    public void setVolume(int volume);
    public int getVolume();
    public void setCanal(int canal);
    public int getCanal();
}
