package aula.arquivos;
import java.io.File;
public class Exemplo01 {
    public static void main(String[] args) {
        File arq;
        arq = new File(".\\Arquivo1.txt");
        System.out.println("arq.getName() " + arq.getName());
        System.out.println("arq.canRead() " + arq.canRead());
        System.out.println("arq.canWrite " + arq.canWrite());
        System.out.println("arq.exists() " + arq.exists());
        System.out.println("arq.getPath() " + arq.getPath());
        System.out.println("arq.isFile() " + arq.isFile());
        System.out.println("arq.getAbsolutePath() " + arq.getAbsolutePath());
        System.out.println("arq.isDirectory() " + arq.isDirectory());

        File home;
        home = new File("\\home");
        System.out.println("home.isDirectory() " + home.isDirectory());
        System.out.println("home.isFile() " + home.isFile());

        File arq0;
        arq0 = new File(".\\Arquivo5.txt");
        System.out.println("arq0.exists() " + arq0.exists() );
    }
}
