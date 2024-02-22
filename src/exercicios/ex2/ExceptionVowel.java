package exercicios.ex2;

public class ExceptionVowel {
    ExceptionVowel(){

    }
    public void checaVogal(String str) throws Exception{
        boolean vogal = false;
        String regex = ".*[aeiouAEIOU].*";
        if (str.matches(regex)){
            vogal = true;
            }
        if(!vogal){
            throw new Exception("Nenhuma vogal encontrada");
        }
        }
    }

