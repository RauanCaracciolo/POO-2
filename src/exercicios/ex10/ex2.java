package exercicios.ex10;

import java.util.ArrayList;
import java.util.List;

public class ex2 {

    public <T extends Number> void somaParImpar(List<T> lista){
        double par = 0;
        double impar = 0;
        for (int i = 0; i < lista.size(); i++){
            if(lista.get(i).doubleValue()%2 == 0){
                par +=  lista.get(i).doubleValue();
            }else{
                impar += lista.get(i).doubleValue();
            }
        }
        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }

}
