package exercicios.ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineList {
    public static void main(String[] args) {
        File arq = new File(".\\Arquivo1.txt");
        try {
            FileReader leitor = new FileReader(arq);
            BufferedReader lt = new BufferedReader(leitor);
            String[] linhas = new String[3];
            String linha;
            int i = 0;
            while ((linha = lt.readLine()) != null) {
                linhas[i] = linha;
                i++;
            }
            leitor.close();
            int f = i;
            for (i = 0; i < f; i++){
                System.out.println(linhas[i]);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
