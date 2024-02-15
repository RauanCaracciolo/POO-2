package aula.excecao;

public class CalculadoraA {
    private Divisao div;
    CalculadoraA(){
        div = new Divisao();
    }
    public int quociente (int numerador, int divisor){
        return div.quociente(numerador,divisor);
    }
}
