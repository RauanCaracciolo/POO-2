package aula.padroesDesign.estruturais.bridge;

public class ControleRemoto {
    private Dispositivo dispositivo;
    public ControleRemoto(Dispositivo dispositivo){
        setDispositivo(dispositivo);
    }
    public Dispositivo getDispositivo(){
        return this.dispositivo;
    }
    public void setDispositivo(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }
    public void acionarBotaoLigaDesliga(){
        if(dispositivo.estaLigado()){
            dispositivo.desligar();
        }else{
            dispositivo.ligar();
        }
    }
    public void volumeUp(){
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }
    public void volumeDown(){
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }
    public void canalUp(){
        dispositivo.setCanal(dispositivo.getCanal() + 1);
    }
    public void canalDown(){
        dispositivo.setCanal(dispositivo.getCanal() - 1);
    }

}
