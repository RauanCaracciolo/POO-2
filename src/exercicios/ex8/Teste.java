package exercicios.ex8;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        ListaDePalavras list = new ListaDePalavras();
        list.setMapa(1, "Rauan");
        list.setMapa(2, "Rauan");
        list.setMapa(3, "Mauro");
        list.setMapa(4, "Rauan");
        list.achaDuplicata();
        System.out.println(list.contaAparencias("Rauan"));

    }
}
