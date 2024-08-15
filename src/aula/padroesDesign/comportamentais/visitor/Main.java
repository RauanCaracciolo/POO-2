package aula.padroesDesign.comportamentais.visitor;

public class Main {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(2.5,5.0);
        Circulo c = new Circulo(3.0);
        Area a = new Area();

        q.accept(a);
        c.accept(a);
    }
}
