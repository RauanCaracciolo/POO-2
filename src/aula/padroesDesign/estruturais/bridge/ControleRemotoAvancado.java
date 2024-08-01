package aula.padroesDesign.estruturais.bridge;

public class ControleRemotoAvancado extends ControleRemoto{

    public ControleRemotoAvancado(Dispositivo dispositivo){
        super(dispositivo);
    }
    public void mutar(){
        getDispositivo().setVolume(0);
    }
}
