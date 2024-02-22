package exercicios.ex3;

public class CheckNumberEnd {
    CheckNumberEnd(){}
    public boolean validate(String test){
        String regex = ".*[0-9]$";
        return test.matches(regex);
    }
}
