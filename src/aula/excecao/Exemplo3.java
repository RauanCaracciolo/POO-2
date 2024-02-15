package aula.excecao;

public class Exemplo3 {
    public static void main(String[] args) {
        try{
            CalculadoraB calc = new CalculadoraB();
            System.out.println("calc.quociente(4,2) " + calc.quociente(4,2 ));
            System.out.println("calc.quociente(4,0) " + calc.quociente(4,0 ));
        } catch (ArithmeticException ex){
            ex.printStackTrace();
        }
    }
}
