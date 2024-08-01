package aula.padroesDesign.criacionais.factoryMethod;

public class TransporteCaminhao implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega por Caminhão!");
    }
}
