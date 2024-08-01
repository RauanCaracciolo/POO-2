package aula.padroesDesign.criacionais.Builder;

public class Motor {

    private int cilindros;
    private double volume;

    public Motor(int cilindros, double volume){
        setCilindros(cilindros);
        setVolume(volume);
    }
    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString(){
        return "Motor ( " + getCilindros() + " cilindros + " +getVolume() + " )";
    }}
