package exercicios.ex4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckReadAndWrite {
    public static void main(String[] args) {
        File arq = new File(".\\Arquivo1.txt");
        System.out.println("O arquivo pode ser lido: " + arq.canRead());
        System.out.println("O arquivo pode ser escrito: " + arq.canWrite());

    }

}
