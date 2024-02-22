package exercicios.ex3;

public class CheckStartNumber {
    CheckStartNumber(){

    }
    public boolean validate(String test){
        String regex = "^4.*$";
        return test.matches(regex);
    }
}
