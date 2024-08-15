package aula.padroesDesign.comportamentais.memento;

public class PontoMemento {
    private Ponto ponto;
    private double x, y;

    public PontoMemento(Ponto ponto, double x, double y) {
        this.ponto = ponto;
        this.x = x;
        this.y = y;
    }
    public void restaurar(){
        ponto.setX(x);
        ponto.setY(y);
    }
}
