package aula.padroesDesign.criacionais.AbstractFactory;

public class MoveisFactoryModerno implements MoveisAbstractFactory{
    @Override
    public Sofa criarSofa(){
        return new SofaModerno();
    }
    public Cadeira criarCadeira(){
        return new CadeiraModerna();
    }
    public Mesa criarMesa(){
        return new MesaModerna();
    }

}
