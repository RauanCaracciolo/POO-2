package aula.padroesDesign.comportamentais.memento;

public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto();
        p.setX(1.0);
        p.setY(1.0);
        System.out.println(p);

        PontoMemento pm1 = p.criarCopia();

        p.setX(2.0);
        p.setY(2.0);
        System.out.println(p);

        PontoMemento pm2 = p.criarCopia();

        p.setX(3.0);
        p.setY(3.0);
        System.out.println(p);

        PontoMemento pm3 = p.criarCopia();

        p.setX(4.0);
        p.setY(4.0);
        System.out.println(p);

        System.out.println("----");

        pm3.restaurar();
        System.out.println(p);

        pm2.restaurar();
        System.out.println(p);

        pm1.restaurar();
        System.out.println(p);
    }
}
