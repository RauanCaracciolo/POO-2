package aula.excecao;

public class Exemplo2 { public static void main(String[] args) {
    String[] vetor = new String[5];

    try {
        System.out.println("Vetor[0] = " + vetor[0]);
        System.out.println(vetor[5]);
        vetor[0] = "IFSP";
        System.out.println("Vetor[0] = " + vetor[0]);
        //  System.out.println("Vetor[1]" + vetor[1].toLowerCase()); lançamento da exceção NullPointerException
        int a = 4, b = 2;
        System.out.println("a/b" + a / b);
        b = 0;
        //    System.out.println("a/b" + a/b); lançamento da exceção ArithmeticException
        Divisao div = new Divisao();
        System.out.println("div.quociente(4,2)" + div.quociente(4, 2));
        CalculadoraA calc = new CalculadoraA();
        System.out.println("calc.quociente(4,2) " + calc.quociente(4, 2));
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Um exc exceção do tipo ArrayIndexOutOfBoundException foi lançada e tratada.");
        System.out.println(ex);
    } catch (NullPointerException ex) {
        System.out.println("Um exc exceção do tipo NullPointerException foi lançada e tratada.");
    } catch (ArithmeticException ex) {
        System.out.println("Um exc exceção do tipo ArithmeticException foi lançada e tratada.");
    } finally {
        System.out.println("O bloco finaly foi executado com sucesso"); // Usado para economizar recursos e aumentar a segurança do software
    }
}
}
