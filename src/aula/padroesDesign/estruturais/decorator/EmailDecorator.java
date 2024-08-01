package aula.padroesDesign.estruturais.decorator;

public class EmailDecorator extends NotificacaoDecorator{

    public EmailDecorator(){
        super(null);
    }
    public EmailDecorator(Notificacao notificacao){
        super(notificacao);
    }
    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Email > " + mensagem);
        if(notificacao != null){
            notificacao.enviarMensagem(mensagem);
        }
    }
}
