package aula.padroesDesign.estruturais.decorator;

public abstract class NotificacaoDecorator implements Notificacao{
    protected Notificacao notificacao;
    public  NotificacaoDecorator(){
        this(null);
    }
    public  NotificacaoDecorator(Notificacao notificacao){
        this.notificacao = notificacao;
    }
}
