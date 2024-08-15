package aula.padroesDesign.comportamentais.templateMethod;

public class Main {
    public static void main(String[] args) {
        CasaPraia veraneio = new CasaPraia();
        veraneio.construir();

        CasaCidade moradia = new CasaCidade();
        moradia.construir();
    }
}
