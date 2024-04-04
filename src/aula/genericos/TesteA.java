package aula.genericos;

public class TesteA {
    public static void main(String[] args) {
        Integer[] vetorInteger = {5,13,51,71,32};
        Double[] vetorDouble = {7.25,9.5,1.75};
        String[] vetorString = {"Abacaxi", "Pera", "Mamão"};

        ClasseA objA = new ClasseA();

        objA.imprimeVetor(vetorInteger);
        System.out.println("-----");

        objA.imprimeVetor(vetorDouble);
        System.out.println("-----");

        objA.imprimeVetor(vetorString);
        System.out.println("-----");
    }
}
