//Exercicio 01
package exercicios.ex13;
import java.util.Scanner;

public class NumeroPar {

    private int numero;

    public NumeroPar(int numero) throws Exception{
        setNumero(numero);
    }
    public void setNumero(int numero) throws Exception{
        if(numero%2 != 0){
            throw new Exception("O numero deve ser par.");
        }
        this.numero = numero;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        boolean ok = false;
        while (!ok){
            System.out.println("Informe um numero inteiro: ");
            numero = input.nextInt();
            try{
                NumeroPar par = new NumeroPar(numero);
                ok = true;
            }catch (Exception e){
                System.out.println("O numero deve ser par.");
            }
        }
    }
}
