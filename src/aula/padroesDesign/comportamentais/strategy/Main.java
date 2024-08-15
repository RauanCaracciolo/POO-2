package aula.padroesDesign.comportamentais.strategy;

public class Main {
    public static void main(String[] args) {
        RotaEstrategia estrategia = new RotaCarro();
        Contexto c = new Contexto(estrategia);
        c.executarEstrategia("Araraquara:Centro", "Araraquara:Jaragua");
    }
}
