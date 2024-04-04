package aula.genericos;

public class TesteB {
    public static void main(String[] args) {
        Integer[] vetorInteger = {5,13,51,71,32};
        Double[] vetorDouble = {7.25,9.5,1.75};
        String[] vetorString = {"Abacaxi", "Pera", "Mamão"};

        ClasseB objB = new ClasseB();

        objB.imprimeVetor(vetorInteger);
        System.out.println("-----");

        objB.imprimeVetor(vetorDouble);
        System.out.println("-----");

        objB.imprimeVetor(vetorString);
        System.out.println("-----");
    }
}
