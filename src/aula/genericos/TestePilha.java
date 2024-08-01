package aula.genericos;

import java.net.InetAddress;

public class TestePilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha();

        pilha.adicionar(13);
        pilha.adicionar(57);
        pilha.adicionar(11);
        pilha.adicionar(-32);
        pilha.adicionar(22);

        System.out.println(pilha);

        System.out.println(pilha.remover());

        System.out.println(pilha);

        int soma = 0;
        while (!pilha.vazia()){
            soma+= pilha.remover();
        }
        System.out.println("Soma:" + soma);

        // pilha de tipo Bruto
        Pilha pilhaB = new Pilha();
        pilhaB.adicionar(13);
        pilhaB.adicionar(57);
        pilhaB.adicionar(11);
        System.out.println(pilhaB);

        soma = 0;
        while (pilhaB.vazia()){
            soma += (Integer) pilhaB.remover();
        }
        System.out.println(soma);
    }
}
