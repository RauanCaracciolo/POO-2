package aula.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemplo04 {
    public static void main(String[] args) {
        Pessoa p1;
        p1 = new Pessoa("Joao", 25, 1.73, 95.5, "333.333.333-33");
        System.out.println(p1.toString());


        FileOutputStream arq;
        try {
            arq = new FileOutputStream(".\\Pessoas.ser");
            ObjectOutputStream output;
            output = new ObjectOutputStream(arq);

            output.writeObject(p1);

            output.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
