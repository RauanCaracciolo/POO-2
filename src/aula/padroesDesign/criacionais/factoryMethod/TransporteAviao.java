package aula.padroesDesign.criacionais.factoryMethod;

public class TransporteAviao implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega por Aviao!");
    }
}
