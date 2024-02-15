package aula.excecao;

import java.sql.SQLOutput;

public class Exemplo1 {
    public static void main(String[] args) {
        String[] vetor = new String[5];
   //     System.out.println("Vetor[5] = " + vetor[5]); lançamento da exceção ArrayIndexOutOfBoundsException

        System.out.println("Vetor[0] = " + vetor[0]);
        vetor[0] = "IFSP";
        System.out.println("Vetor[0] = " + vetor[0]);
    //    System.out.println("Vetor[1]" + vetor[1].toLowerCase()); lançamento da exceção NullPointerException
        int a = 4, b = 2;
        System.out.println("a/b" + a/b);
        b=0;
    //    System.out.println("a/b" + a/b); lançamento da exceção ArithmeticException
        Divisao div = new Divisao();
        System.out.println("div.quociente(4,2)" + div.quociente(4,2) );
        CalculadoraA calc = new CalculadoraA();
        System.out.println("calc.quociente" + calc.quociente(2,0));
    }
}
