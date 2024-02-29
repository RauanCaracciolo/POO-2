package aula.arquivos;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo03 {
    public static void main(String[] args) {
       File arq;
       arq = new File(".\\Arquivo1.txt");

        FileWriter escritor;
        try {
            escritor = new FileWriter(arq);
            escritor.write("Conteúdo do Arquivo2.txt");
            escritor.close();

        }catch  (IOException ex){
            ex.printStackTrace();
        }
    }
}
