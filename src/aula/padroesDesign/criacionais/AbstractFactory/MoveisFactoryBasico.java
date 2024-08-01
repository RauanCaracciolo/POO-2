package aula.padroesDesign.criacionais.AbstractFactory;

public class MoveisFactoryBasico implements MoveisAbstractFactory{

    @Override
    public Sofa criarSofa(){
        return new SofaBasico();
    }
    public Cadeira criarCadeira(){
        return new CadeiraBasica();
    }
    public Mesa criarMesa(){
        return new MesaBasica();
    }

}
