package exercicios.ex8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaDePalavras {
    private Map<Integer, String> mapa;

    ListaDePalavras(){
        mapa = new HashMap<>();
    }

    public void setMapa(int integer, String str){
        mapa.put(integer, str);
    }
    public String getMapa(int integer){
        return mapa.get(integer);
    }
    public void achaDuplicata(){
        for(int i = 0; i <= mapa.size(); i++){
            for (int j = 0; j <= mapa.size(); j++){
                if(mapa.get(i) == (mapa.get(j)) && i != j){
                    System.out.println("Duplicata encontrada: ");
                    System.out.println("Mapa objeto: " + i + " Duplicata de mapa objeto: " + j + " Conteudo: " + mapa.get(i) );
                }
            }
        }
    }
    public int contaAparencias(String str){
        int n = 0;
        for (int i = 0; i <= mapa.size(); i++){
            if (mapa.get(i) == str){
                n++;
            }
        }
        return n;
    }
    public static void deletaRepetido(List lista){
        for (int i = 0; i <= lista.size(); i++){
            for (int j = 0; j <= lista.size(); j++){
                if (lista.get(i) == lista.get(j)){
                    lista.remove(j);
                }
            }
        }
    }
}
