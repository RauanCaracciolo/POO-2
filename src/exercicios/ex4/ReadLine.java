package exercicios.ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    public static void main(String[] args) {
        File arq = new File(".\\Arquivo1.txt");
        try {
            FileReader leitor = new FileReader(arq);
            BufferedReader lt = new BufferedReader(leitor);
            StringBuffer str = new StringBuffer();
            String linha;
            while ((linha = lt.readLine())!=null){
                str.append(linha);
                str.append("\n");
            }
            leitor.close();
            System.out.println(str.toString());
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
