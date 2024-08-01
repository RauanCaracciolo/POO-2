package aula.genericos;

import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> lista;

    public Pilha(){
        lista = new LinkedList<>();
    }
    public void adicionar(T valor){
        lista.addFirst(valor);
    }
    public T remover(){
        T aux;
        if(lista.isEmpty()){
            throw new PilhaVaziaException();
        }else {
            aux = lista.removeFirst();
        }
        return aux;
    }
    public T proximo(){
        T aux;
        if (lista.isEmpty()){
            throw new PilhaVaziaException();
        }else {
            aux = lista.getFirst();
        }
        return aux;
    }
    public boolean vazia(){
        return lista.isEmpty();
    }
    @Override
    public String toString(){
        String str = "";
        if (lista.isEmpty()){
            str = "[]";
        }else {
            for (T e : lista){
                str += "["+e+"]\n";
            }
        }
        return str;
    }
}
