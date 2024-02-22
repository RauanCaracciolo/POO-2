package exercicios.ex3;

public class CheckAZ {
    CheckAZ(){
    }
    public boolean checaAaZ0a9(String test){
        String regex = "^[\\w]+$";
        return test.matches(regex);
    }
}
