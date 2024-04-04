package exercicios.ex9;

public class Testes {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        Integer[] int1 = {1,2,3,4,5};
        Integer[] int2 = {1,2,3,4,5};
        Integer[] int3 = {7,3,3,2,55,3};
        Double[] double1 = {1.2, 3.3, 4.4};
        Double[] double2 = {1.2, 3.3, 4.4};
        Double[] double3 = {2.1, 3.4, 4.12};
        System.out.println("Int1 = Int2: " + m.comparaArray(int1, int2));
        System.out.println("Int1 = Int3: " + m.comparaArray(int1, int3));
        System.out.println("Primeira aparição de '3' em Int1: " + m.achaIndex(int1, 3));
        System.out.println("Primeira aparição de '3' em Int3: " + m.achaIndex(int3, 3));

        System.out.println("double1 = double2: " + m.comparaArray(double1, double2));
        System.out.println("double1 = double3: " + m.comparaArray(double1, double3));
        System.out.println("Primeira aparição de '4.3' em double1: " + m.achaIndex(double1, 4.3));

    }
}
