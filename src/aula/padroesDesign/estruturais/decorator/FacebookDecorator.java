package aula.padroesDesign.estruturais.decorator;

public class FacebookDecorator extends NotificacaoDecorator{

    public FacebookDecorator(){
        super(null);
    }
    public FacebookDecorator(Notificacao notificacao){
        super(notificacao);
    }
    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Facebook > " + mensagem);
        if(notificacao != null){
            notificacao.enviarMensagem(mensagem);
        }
    }
}
