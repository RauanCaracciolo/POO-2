package aula.padroesDesign.estruturais.proxy;

import java.sql.SQLOutput;

public class YoutubeLibe implements YoutubeServico{
    @Override
    public String donwloadVideo(String url){
        String arquivo;

        System.out.println("iniciando o download do video....");

        arquivo = "./home/downloads/url" + ".mp4";
        return arquivo;

    }
}
