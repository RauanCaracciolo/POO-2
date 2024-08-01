package aula.padroesDesign.estruturais.decorator;

public class Main {
    public static void main(String[] args) {
        Notificacao n1 = new SMSDecorator(new FacebookDecorator());
        n1.enviarMensagem("Alerta 1!");

        Notificacao n2 = new EmailDecorator();
        n2.enviarMensagem("Alerta 2!");

        Notificacao n3 = new SMSDecorator(new FacebookDecorator(new EmailDecorator()));
        n3.enviarMensagem("Alerta 3!");
    }
}
