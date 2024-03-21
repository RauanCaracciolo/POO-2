package aula.colecoes;

import java.util.HashMap;
import java.util.Map;

public class MapaExemplo2 {
    public static void main(String[] args) {
        Map<String, Pessoa> mapa = new HashMap<>();
        Pessoa p1 = new Pessoa("Marcos", 26);
        Pessoa p2 = new Pessoa("Natalia", 31);
        Pessoa p3 = new Pessoa("Camila", 18);

        mapa.put("541.233.333-2", p1);
        mapa.put("433.332.765-42", p2);
        mapa.put("365.989.745-8", p3);

        System.out.println(mapa);
        System.out.println(mapa.get("541.233.333-2"));

    }
}
