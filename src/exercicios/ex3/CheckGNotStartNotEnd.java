package exercicios.ex3;

public class CheckGNotStartNotEnd {
    CheckGNotStartNotEnd(){}
    public boolean validate(String test){
        String regex = "\\Bg\\B";
        return test.matches(regex);
    }
}
