package aula.padroesDesign.comportamentais.visitor;

public class Area implements Visitor{

    @Override
    public void visitQuadrado(Quadrado quadrado) {
        System.out.println("Area: " + quadrado.getAltura()* quadrado.getLargura());
    }

    @Override
    public void visitCirculo(Circulo circulo) {
        System.out.println("Area: " + Math.PI * circulo.getRaio() * circulo.getRaio());
    }
}
