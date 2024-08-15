package aula.padroesDesign.comportamentais.strategy;

public class RotaCarro implements RotaEstrategia{

    @Override
    public void rota(String origem, String destino){
        System.out.println(origem + " > rua A > rua B > rua C >" + destino);

    }
}
