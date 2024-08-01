package aula.padroesDesign.criacionais.Builder;

public class CarroBuilder implements Builder{
    private CarroTipo tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    @Override
    public void setCarroTipo(CarroTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }
    @Override
    public Carro getResult(){
        return new Carro(tipo, assentos, motor, transmissao);
    }
}
