package aula.padroesDesign.criacionais.Builder;

public class Main {
    public static void main(String[] args) {
        CarroBuilder builder = new CarroBuilder();
        Diretor diretor = new Diretor(builder);

        Carro maverick = diretor.criarCarroSport();
        System.out.println(maverick);

        Carro mobi = diretor.criarCarroCity();
        System.out.println(mobi);
    }
}
