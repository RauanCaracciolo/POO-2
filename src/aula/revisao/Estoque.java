package aula.revisao;

import java.util.HashMap;

public class Estoque<T>{
    private HashMap<T, Integer> estoque;

    public Estoque(){
        estoque = new HashMap<>();
    }


    public void adicionar(T item, int quantidade){
        if(estoque.containsKey(item)) {
            int quantidadeEstocada = estoque.get(item);
            estoque.put(item, quantidadeEstocada + quantidade);
        }else{
            estoque.put(item,quantidade);
        }
    }
    public boolean removover(T item, int quantidade){
        int quantidadeEstocada = estoque.get(item);
        if(quantidadeEstocada == quantidade){
            estoque.remove(item);
            return true;
        }else{
            if(quantidadeEstocada > quantidade){
                estoque.put(item,quantidadeEstocada-quantidade);
                return true;
            }else{
                System.out.println("A quantidade estocada é menor que a quantidade que deseja remover");
                return false;
            }
        }
    }
    public int quantidade(T item){
        if(estoque.containsKey(item)){
            return item.hashCode();
        }else {
            return 0;
        }
    }
    public String toString(){
        String str = "ESTOQUE\n";
        for(T item :estoque.keySet()){
            str = str.concat(item + " ----" + estoque.get(item));
        }
        return str;
    }
}
