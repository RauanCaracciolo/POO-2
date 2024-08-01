package aula.genericos;
import aula.colecoes.Pessoa;
public class TesteC {
    public static void main(String[] args) {
        ClasseC objC = new ClasseC();
        System.out.println(objC.maximo("abacaxi", "pera", "uva"));
        String str = objC.maximo("abacaxi", "pera", "uva");
        System.out.println(str);

        double max = objC.maximo(2.1,2.2,3.3);
        System.out.println(max);

        Pessoa p1 = new Pessoa("Joao", 13);
        Pessoa p2 = new Pessoa("Pedro", 32);
        Pessoa p3 = new Pessoa("Carlos", 22);

        Pessoa p4 = objC.maximo(p1,p2,p3);
        System.out.println(p4);
    }
}
