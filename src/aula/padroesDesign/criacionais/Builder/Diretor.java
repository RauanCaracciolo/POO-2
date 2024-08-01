package aula.padroesDesign.criacionais.Builder;

public class Diretor {
    CarroBuilder builder;
    public Diretor(CarroBuilder builder){
        this.builder = builder;
    }
    public Carro criarCarroSport(){
        builder.setCarroTipo(CarroTipo.SPORT);
        builder.setAssentos(2);
        builder.setTransmissao(Transmissao.MANUAL);
        builder.setMotor(new Motor(8,5.0));
        return builder.getResult();
    }
    public Carro criarCarroCity(){
        builder.setCarroTipo(CarroTipo.CITY);
        builder.setAssentos(4);
        builder.setTransmissao(Transmissao.AUTOMATICA);
        builder.setMotor(new Motor(4,2.0));
        return builder.getResult();
    }
}
