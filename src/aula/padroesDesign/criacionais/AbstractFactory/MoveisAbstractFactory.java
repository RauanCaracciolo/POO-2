package aula.padroesDesign.criacionais.AbstractFactory;

public interface MoveisAbstractFactory {

    public Sofa criarSofa();
    public Cadeira criarCadeira();
    public Mesa criarMesa();

}
