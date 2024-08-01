package aula.padroesDesign.criacionais.AbstractFactory;

public class Cliente {
    private MoveisAbstractFactory factory;
    private Cadeira cadeira;
    private Mesa mesa;
    private Sofa sofa;

    public Cliente(MoveisAbstractFactory factory){
        this.factory = factory;
        cadeira = factory.criarCadeira();
        mesa = factory.criarMesa();
        sofa = factory.criarSofa();
    }
    @Override
    public String toString(){
        return "( " + cadeira + ", " + mesa + ", " + sofa + " )";
    }
}
