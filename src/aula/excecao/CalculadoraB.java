package aula.excecao;

public class CalculadoraB {
    private Divisao div;
    CalculadoraB(){
        div = new Divisao();
    }
    public int quociente (int numerador, int divisor){
        int resultado;
        try {
            resultado = div.quociente(numerador,divisor);
        } catch (ArithmeticException ex){
            System.out.println("Uma exceção do tipo ArithmeticException foi lançada, parcialmente tratada e entao relançada.");
            throw ex;
        }
        return resultado;
    }}

