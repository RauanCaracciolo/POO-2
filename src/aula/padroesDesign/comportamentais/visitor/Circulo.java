package aula.padroesDesign.comportamentais.visitor;

public class Circulo implements Shape{
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitCirculo(this);
    }
}
