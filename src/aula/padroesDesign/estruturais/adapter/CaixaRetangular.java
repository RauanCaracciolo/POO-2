package aula.padroesDesign.estruturais.adapter;

public class CaixaRetangular {
    private double altura;
    private double comprimento;
    private double largura;

    public CaixaRetangular(double altura, double comprimento, double largura){
        setAltura(altura);
        setComprimento(comprimento);
        setLargura(largura);
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    public boolean aceita(ProdutoRetangular p){
;        return ((getAltura() >= p.getAltura()) && (getComprimento() >= p.getComprimento()) && getLargura()>= p.getLargura());
        }
}
