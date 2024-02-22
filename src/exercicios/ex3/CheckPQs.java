package exercicios.ex3;

public class CheckPQs {
    CheckPQs(){

    }
    public boolean validate(String test){
        String regex = "p.*?q$";
        return test.matches(regex);
    }
}
