package exercicios.ex4;

import java.io.File;

public class CheckLexicographic {
    public static void main(String[] args) {
        File arq1 = new File(".\\Arquivo1.txt");
        File arq2 = new File(".\\Arquivo2.txt");
        System.out.println(arq1.compareTo(arq2));
    }
}
