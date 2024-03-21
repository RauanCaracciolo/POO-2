package aula.colecoes;

import java.util.Stack;

public class PilhaExemplo {
    public static void main(String[] args) {

        // Stack extends Vector (Possui por padrao monitoramento de compartilhamento - já é sincronizado por multi-thread)
        Stack<String> pilha = new Stack<>();

        pilha.push("João");
        pilha.push("Maria");
        pilha.push("Claudio");
        pilha.push("Jose");
        pilha.push("Ruan");
        pilha.push("Paulo");

        System.out.println(pilha);
        System.out.println(pilha.peek());
        System.out.println("-------");

        while (!pilha.empty()){
            System.out.println(pilha.pop());
            if (!pilha.empty()){
                System.out.println(pilha.peek() + "\n");
            }else{
                System.out.println("Não há elemento para ser removido.\n");
            }
        }
    }
}
