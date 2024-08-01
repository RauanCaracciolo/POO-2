package aula.padroesDesign.estruturais.adapter;

public class Main {
    public static void main(String[] args) {
        CaixaRetangular cx1 = new CaixaRetangular(2.5,5.0,3.0);
        CaixaRetangular cx2 = new CaixaRetangular(2.0,5.0,3.0);

        ProdutoRetangular p1 = new ProdutoRetangular(2.25,5.0,3.0);

        System.out.println(cx1.aceita(p1));
        System.out.println(cx2.aceita(p1));

        ProdutoEsferico p2 = new ProdutoEsferico(2.25);
        ProdutoRetangularAdapter p3 = new ProdutoRetangularAdapter(p2);

        System.out.println(cx1.aceita(p3));
        System.out.println(cx2.aceita(p3));
    }
}
