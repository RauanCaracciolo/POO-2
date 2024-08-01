package exercicios.ex14;

import java.util.Arrays;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(20, 40, 10, 22, 55, 2, 1, 4);
        Runnable runnable = () -> {
            int soma = 0, multiplicacao = 1;
            for (int i = 0; i < lista.size(); i++) {
                soma += lista.get(i);
                multiplicacao = multiplicacao * lista.get(i);
            }
            System.out.println("Soma: " + soma);
            System.out.println("Multiplicacao: " + multiplicacao);
        };
        runnable.run();

    }
}
