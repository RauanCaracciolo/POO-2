package aula.expressaoRegular;

public class StringMatches {
    public static void main(String[] args) {
        String str;
        String regex;

        str = "1";
        regex = "\\d";

        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        str = "a";
        regex = "\\d";
        // \d qualquer digito

        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        str = "12";
        regex = "\\d";

        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "a";
        regex = "\\D";
        // \D qualquer NÃO digito

        str = "a";
        regex = "\\S";
        // \S qualquer caracter Não espaço

        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = " ";
        regex = "\\S";

        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = " ";
        regex = "\\s";

        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "o";
        regex = "[aeiou]";

        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "o";
        regex = "[a-z]";

        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "O";
        regex = "[a-z]";

        System.out.println(str + " | " + regex + " | " + str.matches(regex));
    }
}
