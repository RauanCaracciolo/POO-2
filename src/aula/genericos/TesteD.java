package aula.genericos;
import aula.colecoes.Pessoa;

public class TesteD {
    public static void main(String[] args) {
        ClasseD objD = new ClasseD();
        System.out.println(objD.maximo("abacaxi", "pera", "uva"));
        String str = objD.maximo("abacaxi", "pera", "uva");
        System.out.println(str);

        double max = objD.maximo(2.1,2.2,3.3);
        System.out.println(max);

        Pessoa p1 = new Pessoa("Joao", 13);
        Pessoa p2 = new Pessoa("Pedro", 32);
        Pessoa p3 = new Pessoa("Carlos", 22);

        Pessoa p4 = objD.maximo(p1,p2,p3);
        System.out.println(p4);
    }
}
