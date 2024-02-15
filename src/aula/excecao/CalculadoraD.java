package aula.excecao;

public class CalculadoraD {
    private Divisao div;
    CalculadoraD(){
        div = new Divisao();
    }
    public int quociente (int numerador, int divisor){
        int resultado;
        try {
            resultado = div.quociente(numerador,divisor);
        } catch (ArithmeticException ex){
            System.out.println("Uma exceção do tipo ArithmeticException foi lançada, parcialmente tratada e entao relançada.");
            throw new ExcecaoDivisaoInteiraPorZero();
        }
        return resultado;
    }}

