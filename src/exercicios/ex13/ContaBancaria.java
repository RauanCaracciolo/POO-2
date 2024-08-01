package exercicios.ex13;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(){
        saldo = 0.0;
    }
    public synchronized void depositar(double valor) throws InterruptedException{
        this.saldo += valor;
    }
    public synchronized void sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
