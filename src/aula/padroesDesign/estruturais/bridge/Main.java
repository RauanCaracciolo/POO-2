package aula.padroesDesign.estruturais.bridge;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto cr1 = new ControleRemoto(tv);

        cr1.acionarBotaoLigaDesliga();

        System.out.println(tv.estaLigado());
    }
}
