package aula.padroesDesign.criacionais.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Logistica lg1 = new LogisticaRodoviaria();
        lg1.executarEntrega();

        Logistica lg2 = new LogisticaMaritima();
        lg2.executarEntrega();

        Logistica lg3 = new LogisticaAerea();
        lg3.executarEntrega();
    }
}
