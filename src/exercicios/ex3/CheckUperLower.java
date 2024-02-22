package exercicios.ex3;

public class CheckUperLower {
    CheckUperLower(){}
    public boolean validate(String test){
        String regex = "[A-Z][a-z]+$";
        return test.matches(regex);
    }
}
