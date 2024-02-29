package aula.arquivos;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo02 {
    public static void main(String[] args) {
        File arq;
        arq = new File(".\\Arquivo1.txt");

        FileReader leitor;
        try {
            leitor = new FileReader(arq);
            char c;
            c = (char) leitor.read();
            System.out.println(c);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
