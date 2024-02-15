package aula.excecao;

public class CalculadoraC {
    private Divisao div;
    CalculadoraC(){
        div = new Divisao();
    }
    public int quociente (int numerador, int divisor) throws ExcecaoDivisaoPorZero{
        int resultado;
        try {
            resultado = div.quociente(numerador,divisor);
        } catch (ArithmeticException ex){
            System.out.println("Uma exceção do tipo ArithmeticException foi lançada e tratada.");
            throw new ExcecaoDivisaoPorZero();
        }
        return resultado;
    }}

