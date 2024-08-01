//Exercicio 17
package exercicios.ex13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TesteLe3Linhas {
        public static void main(String[] args) {
            File arq = new File("Arquivo2.txt");
            FileReader leitor; //objeto para ler aqrquivo texto
            BufferedReader buffer; //para ler linhas
            try{
                leitor = new FileReader(arq);
                buffer = new BufferedReader(leitor);

                String conteudo;
                conteudo = buffer.readLine();

                String linha;
                linha = buffer.readLine();
                if(linha != null){
                    conteudo += "\n" + linha;
                    linha = buffer.readLine();
                    if(linha != null){
                        conteudo += "\n" + linha;
                    }
                }
                System.out.println(conteudo);
                buffer.close();
                leitor.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }
    }
