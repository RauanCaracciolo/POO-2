package aula.padroesDesign.comportamentais.observer;

public class Email implements EventoListener{
    private String endereco;

    public Email(String endereco) {
        setEndereco(endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public void update(String mensagem){
        System.out.println("Para: " + endereco + " \nMensagem: " + mensagem);
    }
}
