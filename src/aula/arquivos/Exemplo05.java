package aula.arquivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exemplo05 {
    public static void main(String[] args) {
        Pessoa p1 = null;
        FileInputStream arq;
        try {
            arq = new FileInputStream(".\\Pessoas.ser");
            ObjectInputStream input;
            input = new ObjectInputStream(arq);
            p1 = (Pessoa) input.readObject();
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println(p1.toString());
    }
}
