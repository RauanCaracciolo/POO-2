//Exercicio 5
package exercicios.ex13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TesteFile {
    public static void main(String[] args) {
        File arq = new File("Arquivo2.txt");
        FileReader leitor; //objeto para ler aqrquivo texto
        BufferedReader buffer; //para ler linhas
        try{
            leitor = new FileReader(arq);
            buffer = new BufferedReader(leitor);

            String linha;
            linha = buffer.readLine();
            if(linha == null){
                throw new Exception("O arquivo esta vazio");
            }
            System.out.println(linha);
            buffer.close();
            leitor.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
