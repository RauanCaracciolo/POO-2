package aula.excecao;

public class Exemplo6 {
    public static void main(String[] args){
        CalculadoraC calc1;
        try {
            calc1 = new CalculadoraC();
            System.out.println("calc1.quociente(4,0) " + calc1.quociente(4,0));
        } catch (ExcecaoDivisaoPorZero ex) {
            System.out.println("Uma exceção do tipo ExecaoDIvisaoPorZero foi lancada e tratada");
        } finally {
            calc1 = null;
        }
    }
}
