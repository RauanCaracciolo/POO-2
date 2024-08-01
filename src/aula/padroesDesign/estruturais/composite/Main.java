package aula.padroesDesign.estruturais.composite;

public class Main {
    public static void main(String[] args) {
        Caixa cx = new Caixa();
        cx.adicionarCaixa(new Caixa("p1",2.0));
        cx.adicionarCaixa(new Caixa("p2",2.0));
        cx.adicionarCaixa(new Caixa("p3",2.0));
        cx.adicionarCaixa(new Caixa("p4",2.0));
        cx.adicionarCaixa(new Caixa("p5",2.0));
        cx.adicionarCaixa(new Caixa("p6",2.0));

        cx.obterCaixa(2).adicionarCaixa(new Caixa("p7", 2.0));
        cx.obterCaixa(2).adicionarCaixa(new Caixa("p8", 2.0));
        cx.obterCaixa(2).adicionarCaixa(new Caixa("p9", 2.0));

    }
}
