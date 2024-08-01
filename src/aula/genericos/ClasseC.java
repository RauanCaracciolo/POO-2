package aula.genericos;

public class ClasseC {

    //T tem um relacionamento de "é um" com Comparable(o limite superior do tipo generico T)
    public <T extends Comparable<T>> T maximo(T p1, T p2, T p3){
        T max = p1;
        if (max.compareTo(p2) < 0){
            max = p2;
        }
        if (max.compareTo(p3) < 0){
            max = p3;
        }
        return max;
    }
}
