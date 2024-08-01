//Ex 12 a 16
package exercicios.ex13;

public class TestePythonJava {
    public static void main(String[] args) {
        String str = "Java is the best!";
        String regex = "Python";
        str = str.replace(regex, "Java");
        System.out.println(str);
        str = "Python is the best!";
        str = str.replace(regex, "Java");
        System.out.println(str);

        //14, 15 e 16
        String str2 = str.replaceAll("[aeiou]","");
        System.out.println(str2);
        int contador = str.length() - str2.length();
        System.out.println(contador);

        //16


    }
}
