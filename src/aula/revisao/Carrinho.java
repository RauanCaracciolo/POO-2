package aula.revisao;

import java.util.HashMap;

public class Carrinho <T>{
    private Estoque estoque;
    private HashMap<T, Integer> carrinho;
    public Carrinho(Estoque<T> estoque){
        this.estoque = estoque;
        carrinho = new HashMap();
    }

    public boolean adicionar(T item, int quantidade){
        if(estoque.quantidade(item) >= quantidade){
            if(carrinho.containsKey(item)){
                int quantidadeAdicionada = carrinho.get(item);
                carrinho.put(item, quantidadeAdicionada + quantidade);
            }else {
                carrinho.put(item, quantidade);
                estoque.removover(item, quantidade);
            }
            return true;
        }else{
            System.out.println("Não há items suficientes no estoque!");
            return false;
        }
    }
    public boolean remover(T item, int quantidade){
        if(carrinho.containsKey(item)){
            int quantidadeCarrinho = carrinho.get(item);
            if(quantidadeCarrinho >= quantidade){
                if(quantidadeCarrinho == quantidade){
                    carrinho.remove(item);
                }else{
                    carrinho.put(item, quantidadeCarrinho - quantidade);
                }
                estoque.adicionar(item, quantidade);
                return true;
            }else {
                return false;
            }
        }else{
            System.out.println("O carrinho nao tem esse item!");
            return false;
        }
    }
    @Override
    public String toString(){
        String str = "Carrinho\n";
        for(T item :carrinho.keySet()){
            str = str.concat(item + " ----" + carrinho.get(item));
        }
        return str;
    }
}
