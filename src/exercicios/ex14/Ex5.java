package exercicios.ex14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("b","a","e","f","a");
        Runnable runnable = () -> Collections.sort(list);
        runnable.run();
        System.out.println(list);
    }
}
