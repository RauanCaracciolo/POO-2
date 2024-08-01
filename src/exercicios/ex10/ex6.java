package exercicios.ex10;

import java.util.ArrayList;

public class ex6 {
    public <T extends Comparable> ArrayList<T> listaPredicado(ArrayList<T> list, T predicado ){
        ArrayList<T> retorno = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).compareTo(predicado) >= 1 || list.get(i).compareTo(predicado) == 0){
                retorno.add(list.get(i));
            }
        }
    return retorno;
    }
}
