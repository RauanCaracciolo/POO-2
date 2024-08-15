package aula.padroesDesign.comportamentais.observer;

public class Main {
    public static void main(String[] args) {
        Email em1 = new Email("Teste@uol.com");
        Email em2 = new Email("Teste@gmail.com");
        EventManager promocoes = new EventManager();

        promocoes.inscrever(em1);
        promocoes.inscrever(em2);
        promocoes.notificar("Promoção A");
        promocoes.remover(em2);
        promocoes.notificar("Promoção B");
    }

}
