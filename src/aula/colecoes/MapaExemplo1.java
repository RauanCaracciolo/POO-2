package aula.colecoes;

import java.util.HashMap;
import java.util.Map;

public class MapaExemplo1 {
    public static void main(String[] args) {
        Map<String, Double> mapa = new HashMap<>();
        mapa.put("Paulo", 1.25);
        mapa.put("Maria", 9.25);
        mapa.put("Carlos", 0.25);
        mapa.put("Matheus", 8.5);
        //mapa.put("Paulo", 7.25); // erro logico, pois chaves precisam ser unicas



        System.out.println(mapa);
        double nota = mapa.get("Maria");
        System.out.println(nota);


    }
}
