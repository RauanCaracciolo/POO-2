package aula.padroesDesign.estruturais.facade;

import java.io.File;
import java.io.FileWriter;

public class LeiaMe {
    public void criarLeiaMe(String diretorio, String autor, String mensagem){

        if (diretorio == null){
            diretorio = "./";
        }
        File arquivo;

        FileWriter escritor;
        try {
            arquivo = new File(diretorio + "LEIAME");
            escritor = new FileWriter(arquivo, true);

            escritor.write("\n---");
            escritor.write("\nAutor: " + autor);
            escritor.write("\nMensagem: " + mensagem);

            escritor.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
