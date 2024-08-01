package aula.padroesDesign.criacionais.Builder;

public interface Builder {
    void setCarroTipo(CarroTipo tipo);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao transmissao);
    Carro getResult();
}
