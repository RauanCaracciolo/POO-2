package aula.rede;

import java.io.Serializable;

public class Mensagem implements Serializable{
    private String autor;
    private String conteudo;

    public Mensagem(String autor, String conteudo)  {
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "autor='" + autor + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
