package aula.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaExemplo5 {
    public static void main(String[] args) {
        List<Carta> baralho = new ArrayList<>();

        String[] naipes = {"Espadas", "Paus", "Copas", "Ouro"};

        for (String na: naipes){
            for (int va = 1; va <= 13; va++){
                baralho.add(new Carta(va, na));
            }
        }
        System.out.println(baralho);
        Collections.shuffle(baralho);
        System.out.println(baralho);
    }
}
