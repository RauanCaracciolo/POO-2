package aula.padroesDesign.criacionais.factoryMethod;

public abstract class Logistica {

    protected Transporte transporte;

    public void executarEntrega(){
        System.out.println("Executando Entrega.");
        transporte = criarTransporte();
        transporte.entregar();
    }
    // Método Factory
    protected abstract Transporte criarTransporte();

}
