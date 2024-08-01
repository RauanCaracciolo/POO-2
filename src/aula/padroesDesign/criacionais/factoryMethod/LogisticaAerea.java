package aula.padroesDesign.criacionais.factoryMethod;

public class LogisticaAerea extends Logistica{
    //Metodo Factory
    @Override
    protected Transporte criarTransporte() {
        return new TransporteAviao();
    }
}
