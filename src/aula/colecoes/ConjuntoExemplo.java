package aula.colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoExemplo {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(13);
        conjunto.add(11);
        conjunto.add(0);
        conjunto.add(22);

        System.out.println(conjunto);

        System.out.println("----");

        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.remove();
        }
    }
}
