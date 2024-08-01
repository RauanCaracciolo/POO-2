package exercicios.ex13;

public class Teste {
    public static void main(String[] args) {

        try{
            StringDNA dna = new StringDNA("JAVA");
            System.out.println(dna);
        }catch (Exception e){
            System.out.println("");
            e.printStackTrace();
        }
    }

}
