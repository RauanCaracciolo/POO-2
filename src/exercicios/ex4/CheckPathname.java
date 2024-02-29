package exercicios.ex4;
import java.io.File;
import java.io.IOException;

public class CheckPathname {
    public static void main(String[] args) {
        File arq = new File(".\\Arquivo1.txt");
        System.out.println("Arquivo 1 existe: " + arq.exists());
        File arq2 = new File(".\\test2.txt");
        System.out.println("Arquivo 2 existe: " + arq2.exists());
    }

}
