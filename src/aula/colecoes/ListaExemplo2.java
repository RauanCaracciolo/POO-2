package aula.colecoes;
//ArrayList é eficiente para o acesso específico(por meio de indíce), mas é ineficiente em operações de inseção e remoção
//dentr os elementos existentes(deslocação de elementos)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaExemplo2 {
    public static void main(String[] args) {
        String[] cores = {"Vermelho","Azul","Verde","Branco"};
        List<String> lista = new ArrayList<>();

        for (String cor : cores){
            lista.add(cor);
        }
        System.out.println(lista);

        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(lista);

    }
}
