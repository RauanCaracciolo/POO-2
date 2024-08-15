package aula.revisao;

public class Teste1 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Batata Frita", TipoProduto.PERECIVEL, "Batata palito congelada 1KG", 8.50);
        Produto p2 = new Produto("Tomate", TipoProduto.PERECIVEL, "Tomate fresco do hortifruti", 5.5);
        System.out.println(p1);
        System.out.println(p2);

        Estoque<Produto> estoque = new Estoque<>();
        estoque.adicionar(p1,50);
        estoque.adicionar(p2,50);

        System.out.println(estoque);
        System.out.println("===============");

        estoque.removover(p1,25);
        estoque.removover(p2,12);

        System.out.println(estoque);
    }
}
