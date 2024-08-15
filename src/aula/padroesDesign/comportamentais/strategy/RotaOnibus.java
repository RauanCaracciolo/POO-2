package aula.padroesDesign.comportamentais.strategy;

public class RotaOnibus implements RotaEstrategia{

    @Override
    public void rota(String origem, String destino){
        System.out.println(origem + " > Ônibus A Ponto 1 > Ônibus B Ponto 5 > " + destino);

    }
}
