package aula.colecoes;

import java.util.ArrayList;

public class ListaExemplo1 {
    public static void main(String[] args) {
        ArrayList lista1 = new ArrayList();
        lista1.add(new Pessoa("Gustavo", 25));
        lista1.add(new Pessoa("Rauan", 19));
        System.out.println(lista1);

        //Downcasting de Object para Pessoa
        Pessoa p1 = (Pessoa) lista1.get(0);
        System.out.println(p1);

        ArrayList<Pessoa> lista2 = new ArrayList<>();
        lista2.add(new Pessoa("Joao", 22));
        lista2.add(new Pessoa("Pedro", 22));
        System.out.println(lista2);

        //Nao precisa fazer o casting, é mais economico computacionalmente
        p1 = lista2.get(0);
        System.out.println(p1);

        System.out.println("---");

        ArrayList<Integer> lista3 = new ArrayList<>();

        //Operação de auto-boxing
        lista3.add(13);
        lista3.add(1);
        lista3.add(2);
        lista3.add(5);
        System.out.println(lista3);

        int numero;
        //auto-unboxing
        numero = lista3.get(0);
        System.out.println(numero);

    }
}
