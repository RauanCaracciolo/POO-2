package aula.padroesDesign.criacionais.factoryMethod;

public class LogisticaMaritima extends Logistica{
    //Metodo Factory
    @Override
    protected Transporte criarTransporte() {
        return new TransporteNavio();
    }
}
