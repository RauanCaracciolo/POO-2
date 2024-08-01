package aula.genericos;

public class ClasseD extends ClasseC{

    public <T extends Comparable<T>> T maximo(T p1, T p2, T p3){
        T max = p1;
        if (max.compareTo(p2) < 0){
            max = p2;
        }
        if (max.compareTo(p3) < 0){
            max = p3;
        }
        System.out.println("O maximo entre (" + p1 + ", " + p2 + ", " + p3 + ") é: " + max);
        return max;
    }

}
