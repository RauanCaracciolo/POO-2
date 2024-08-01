package aula.padroesDesign.estruturais.flywheight;

public class Particula {
    private double x;
    private double y;
    private ParticulaTextura textura;
    public Particula(double x, double y, ParticulaTextura textura){
        setX(x);
        setY(y);
        setTextura(textura);
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

    public ParticulaTextura getTextura() {
        return textura;
    }

    public void setTextura(ParticulaTextura textura) {
        this.textura = textura;
    }
}
