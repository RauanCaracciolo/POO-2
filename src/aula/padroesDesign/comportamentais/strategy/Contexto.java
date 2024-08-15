package aula.padroesDesign.comportamentais.strategy;

public class Contexto {
    private RotaEstrategia estrategia;

    public  Contexto(RotaEstrategia estrategia){
        setEstrategia(estrategia);
    }
    public RotaEstrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(RotaEstrategia estrategia) {
        this.estrategia = estrategia;
    }
    public void executarEstrategia(String origem, String destino){
        estrategia.rota(origem, destino);
    }
}
