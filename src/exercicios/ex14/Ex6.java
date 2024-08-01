package exercicios.ex14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(2.3,4.5,663.2,0.1,0.0,10.2);
        double resultado[] = {0.0};
        Runnable runnable = () -> {
            for(int i = 0; i < list.size(); i++) {
                resultado[0] = resultado[0] + list.get(i);
            }
            resultado[0] = resultado[0]/list.size();
        };
        runnable.run();
        System.out.println(resultado[0]);
    }
}
