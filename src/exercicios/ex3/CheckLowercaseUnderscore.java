package exercicios.ex3;

public class CheckLowercaseUnderscore {
    CheckLowercaseUnderscore(){}
    public boolean validate(String test){
        String regex = "[a-z]+_[a-z]+$";
        return test.matches(regex);
    }
}
