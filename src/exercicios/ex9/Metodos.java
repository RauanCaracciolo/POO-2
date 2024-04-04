package exercicios.ex9;

public class Metodos {

    Metodos(){

    }
    public <T> boolean comparaArray(T[] l1, T[] l2){
        if(l1.length != l2.length){
            return false;
        }else{
            for(int i = 0; i < l1.length; i++){
                if (l1[i] != l2[i]){
                        return false;
                    }
                }
            }
        return true;
    }
    public <T> int achaIndex(T[] lista, T n){
        int retorno = -1;
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == n){
                retorno = i;
                i = lista.length;
            }
        }
        return retorno;
    }
}
