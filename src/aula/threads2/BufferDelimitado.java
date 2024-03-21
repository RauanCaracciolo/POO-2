package aula.threads2;

import java.util.ArrayList;

public class BufferDelimitado {
    private  int tamanho;
    private ArrayList valores;
    private boolean cheio;
    private boolean vazio;

    public BufferDelimitado(int tamanho){
        this.tamanho = tamanho;
        valores = new ArrayList();
        cheio = false;
        vazio = true;
    }
}
