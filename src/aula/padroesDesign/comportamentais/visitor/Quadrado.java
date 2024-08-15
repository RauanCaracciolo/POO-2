package aula.padroesDesign.comportamentais.visitor;

public class Quadrado implements Shape{

    private double largura, altura;

    public Quadrado(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitQuadrado(this);
    }
}
