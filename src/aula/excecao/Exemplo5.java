package aula.excecao;

public class Exemplo5 {
    public static void main(String[] args) throws ExcecaoDivisaoPorZero{
        CalculadoraC calc1 = new CalculadoraC();
        System.out.println("calc1.quociente(4,0) " + calc1.quociente(4,0));
    }
}
