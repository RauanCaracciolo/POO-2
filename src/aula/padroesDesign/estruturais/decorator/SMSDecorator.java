package aula.padroesDesign.estruturais.decorator;

public class SMSDecorator extends NotificacaoDecorator{

    public SMSDecorator(){
        super(null);
    }
    public SMSDecorator(Notificacao notificacao){
        super(notificacao);
    }
    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("SMS > " + mensagem);
        if(notificacao != null){
            notificacao.enviarMensagem(mensagem);
        }
    }
}
