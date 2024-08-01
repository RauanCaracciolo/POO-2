package aula.padroesDesign.criacionais.factoryMethod;

public class LogisticaRodoviaria extends Logistica{
    //Metodo Factory
    @Override
    protected Transporte criarTransporte() {
        return new TransporteCaminhao();
    }
}
