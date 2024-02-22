package exercicios.ex3;

public class CheckPZeros {
    CheckPZeros(){

    }
    public boolean validate(String test){
        String regex = "(pq+?)";
        return test.matches(regex);
    }
}
