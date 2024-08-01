package aula.padroesDesign.criacionais.Builder;

public class Carro {
    private CarroTipo tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;

    private double combustivel;

    public Carro(CarroTipo tipo, int assentos, Motor motor, Transmissao transmissao){
        this.tipo = tipo;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.combustivel = 0.0;
    }

    public double getCombustivel(){
        return combustivel;
    }

    public CarroTipo getTipo() {
        return tipo;
    }

    public int getAssentos() {
        return assentos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public void setCombustivel(double combustivel){
        this.combustivel = combustivel;
    }
    @Override
    public String toString(){
        return getTipo() + "Assentos (" + getAssentos() + ") " + getMotor() + " " + getTransmissao();
    }
}
