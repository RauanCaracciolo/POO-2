package exercicios.ex3;

public class CheckG {
    CheckG(){}
    public boolean validate(String test){
        String regex = "\\w*g.\\w*";
        return test.matches(regex);
    }
}
