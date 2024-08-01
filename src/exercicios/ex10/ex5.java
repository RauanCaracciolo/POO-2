package exercicios.ex10;

import java.util.ArrayList;
import java.util.List;

public class ex5 {
    public <T> List<T> mergeLists(List<T> l1, List<T> l2){
        List<T> retorno = new ArrayList<>();
        if(l1.size() > l2.size()){
            for (int i = 0; i < l1.size(); i++){
                if(i < l2.size()){
                    retorno.add(l1.get(i));
                    retorno.add(l2.get(i));
                }else {
                    retorno.add(l1.get(i));
                }
            }
        }else{
            for (int i = 0; i < l2.size(); i++){
                if(i < l1.size()){
                    retorno.add(l2.get(i));
                    retorno.add(l1.get(i));
                }else {
                    retorno.add(l2.get(i));
                }
            }
        }
        return retorno;
    }
}
