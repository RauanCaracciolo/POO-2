package exercicios.ex14;

import java.util.stream.IntStream;

public class Ex8 {
    public static void main(String[] args) {
        int n = 3;
        int resultado = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
        System.out.println(resultado);
    }
}
