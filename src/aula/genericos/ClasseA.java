package aula.genericos;

public class ClasseA {

    public void imprimeVetor(Integer[] vetor){
            for (Integer e: vetor){
                System.out.println(e);
            }
    }
    public void imprimeVetor(Double[] vetor){
        for (Double e: vetor){
            System.out.println(e);
        }
    }
    public void imprimeVetor(String[] vetor){
        for (String e: vetor){
            System.out.println(e);
        }
    }

}
