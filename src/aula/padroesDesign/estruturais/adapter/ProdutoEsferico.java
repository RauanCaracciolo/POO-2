package aula.padroesDesign.estruturais.adapter;

public class ProdutoEsferico {
    private double diametro;

    public ProdutoEsferico(double diametro){
        setDiametro(diametro);
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}

