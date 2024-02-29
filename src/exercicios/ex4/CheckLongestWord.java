package exercicios.ex4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckLongestWord {
    public static void main(String[] args) {
        File arq = new File(".\\Arquivo1.txt");
        try {
            FileReader leitor = new FileReader(arq);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
