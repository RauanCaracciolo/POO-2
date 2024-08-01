package exercicios.ex14;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        Runnable runnable;
        List<Integer> lista = Arrays.asList(10,20,2,10,66);
        runnable = () ->{
          int maior=0, menor= 10000;
          for(int i = 0; i < lista.size(); i++){
              if(lista.get(i) > maior){
                  maior = lista.get(i);
              }
              if(lista.get(i) < menor ){
                  menor = lista.get(i);
              }

          }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        };
        runnable.run();
    }
}
