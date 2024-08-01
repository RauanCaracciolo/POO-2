package aula.padroesDesign.estruturais.flywheight;

public class ParticulaTextura {
    private String cor;
    private String arquivo;

    public ParticulaTextura(String cor, String arquivo){
        setArquivo(arquivo);
        setCor(cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
