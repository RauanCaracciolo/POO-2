package aula.padroesDesign.criacionais.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        MoveisAbstractFactory factory = new MoveisFactoryModerno();
        Cliente cl1 = new Cliente(factory);
        System.out.println(cl1.toString());
    }
}
