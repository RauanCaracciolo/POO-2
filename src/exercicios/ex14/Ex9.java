package exercicios.ex14;

public class Ex9 {
    public static void main(String[] args) {
        Runnable runnable;
        int n = 6;
        runnable = () -> {
            boolean primo = true;
            for(int i = 2; i < n; i++){
                if(n%i == 0 ){
                    primo = false;
                }
            }
           if(primo){
               System.out.println("Primo");
           }else{
               System.out.println("Nao e primo");
           }
        };
        runnable.run();
    }
}
