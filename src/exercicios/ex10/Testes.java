package exercicios.ex10;

import java.util.ArrayList;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        ex2 test = new ex2();
        ex5 test5 = new ex5();
        ex6 test6 = new ex6();

        ArrayList<Integer> int1 = new ArrayList<>();
        int1.add(1);
        int1.add(3);
        int1.add(6);
        int1.add(2);

        List<Integer> int2 = new ArrayList<>();
        int2.add(3);
        int2.add(34);
        int2.add(55);
        int2.add(222);
        int2.add(221);

        List<Double> double1 = new ArrayList<>();
        double1.add(2.2);
        double1.add(5.4);
        double1.add(2.0);
        test.somaParImpar(int1);
        test.somaParImpar(double1);
        System.out.println(test5.mergeLists(int1, int2));

        System.out.println(test6.listaPredicado(int1, 2));
    }
}
