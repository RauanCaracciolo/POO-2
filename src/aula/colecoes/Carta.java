package aula.colecoes;

public class Carta {
    private int valor;
    private String naipe;

    public Carta(int valor, String naipe){
        setValor(valor);
        setNaipe(naipe);
    }

    public int getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }

    private void setValor(int valor) {
        if(valor >= 1 && valor <= 13){
            this.valor = valor;
        }else {
            throw new RuntimeException("Valor invalido.");
        }
    }

    public void setNaipe(String naipe) {
        if (naipe.equals("Espadas") || naipe.equals("Paus") || naipe.equals("Copas") || naipe.equals("Ouro")){
            this.naipe = naipe;
        }else{
            throw new RuntimeException("Naipe invalido");
        }
    }
    @Override
    public String toString(){
        String nome;

        if(getValor() == 1){
            nome = "Ás";
        }else if (getValor() == 11){
            nome = "Valete";
        }else if(getValor() == 12){
            nome = "Rainha";
        }else if(getValor() == 13){
            nome = "Rei";
        }else {
            nome = Integer.toString(getValor());
        }

        return nome + " de " + getNaipe();
    }
}
