package aula.padroesDesign.comportamentais.observer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EventManager{
    private ArrayList<EventoListener> inscricoes;
    public EventManager(){
        inscricoes = new ArrayList<>();
    }
    public void inscrever(EventoListener e){
        if(!inscricoes.contains(e)){
            inscricoes.add(e);
        }
    }
    public void remover(EventoListener e){
        if(inscricoes.contains(e)){
            inscricoes.remove(e);
        }
    }
    public void notificar(String mensagem){
        for(EventoListener e : inscricoes){
            e.update(mensagem);
        }
    }
}
