package exercicios.ex2;

public class ExceptionOdd {

    ExceptionOdd(){

    }
    public void checaImpar(int n) throws Exception {
        if(n%2 == 1){
            throw new Exception("O numero informado é impar");
        }
    }
}
