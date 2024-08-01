//Ex 16
package exercicios.ex13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TesteEscrita {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File arq = new File("Arquivo5.txt");
        FileWriter escritor;
        BufferedWriter buffer;
        try{
            escritor = new FileWriter(arq);
            buffer = new BufferedWriter(escritor);

            System.out.print("Informe o Texto que sera adicionado no arquivo: ");
            String info;
            info = scan.next();

            buffer.write(info);

            buffer.close();
            escritor.close();
        }catch (Exception ex){

        }
        if(!arq.exists()){

        }
    }
}
