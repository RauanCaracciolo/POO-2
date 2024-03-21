package aula.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaExemplo4 {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        Pessoa p1 = new Pessoa("Marcos", 26);
        Pessoa p2 = new Pessoa("Natalia", 31);
        Pessoa p3 = new Pessoa("Camila", 18);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(Collections.max(lista));
        System.out.println(Collections.min(lista));
    }
}
