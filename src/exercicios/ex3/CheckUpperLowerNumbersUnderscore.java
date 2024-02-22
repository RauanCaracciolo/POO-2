package exercicios.ex3;

public class CheckUpperLowerNumbersUnderscore {
    CheckUpperLowerNumbersUnderscore(){}
    public boolean validate(String test){
        String regex = "^[a-zA-Z0-9_]*$";
        return test.matches(regex);
    }
}
