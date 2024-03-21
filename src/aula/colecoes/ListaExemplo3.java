package aula.colecoes;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaExemplo3 {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        lista.add("azul");
        lista.add("verde");
        lista.addFirst("amarelo");
        lista.addFirst("branco");

        System.out.println(lista);

        LinkedList<String> lista2 = new LinkedList<>();

        lista2.add("preto");
        lista2.add("rosa");
        lista2.add("amarelo");
        System.out.println(lista2);

        lista.addAll(lista2);
        System.out.println(lista);
        System.out.println("---");

        System.out.println(Collections.frequency(lista, "amarelo"));
        System.out.println(Collections.frequency(lista, "azul"));
        System.out.println(Collections.frequency(lista, "laranja"));

        System.out.println(Collections.disjoint(lista,lista2));
        System.out.println("---");

        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);

        System.out.println("--------");

        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(Collections.binarySearch(lista,"azul"));
        System.out.println("-------");

        Collections.fill(lista2, "laranja");
        System.out.println(lista2);
    }
}
