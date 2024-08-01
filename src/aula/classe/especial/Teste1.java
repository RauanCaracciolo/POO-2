package aula.classe.especial;

public class Teste1 {
    public static void main(String[] args) {
        System.out.println(FormaGeometrica1.cor.VERMELHO);
        System.out.println(FormaGeometrica1.cor.values()[0]);
        System.out.println("-----");

        for(FormaGeometrica1.cor e: FormaGeometrica1.cor.values()){
            System.out.println(e);
        }
    }
}
