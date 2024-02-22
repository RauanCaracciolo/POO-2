package exercicios.ex2;

public class ExceptionDuplicate {

    public void checaDuplicada(int[] lista) throws Exception{
        for(int i = 0; i < lista.length; i++){
            for(int j = 1; j < lista.length - i; j++){
                if (lista[i] == lista[i+j]){
                    throw new Exception("Duplicata encontrada");
                }
            }
    }
    }
}
