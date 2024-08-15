package aula.padroesDesign.comportamentais.memento;

public class Ponto {
    private double x,y;

    public Ponto() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String toString(){
        return "( " + x + ", " + y + " )";
    }

    public PontoMemento criarCopia(){
        return new PontoMemento(this, x, y);
    }
}
