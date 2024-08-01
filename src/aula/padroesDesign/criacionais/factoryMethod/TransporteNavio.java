package aula.padroesDesign.criacionais.factoryMethod;

public class TransporteNavio implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega por Navio!");
    }
}
