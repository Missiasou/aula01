package br.com.letscode;


import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class MainArgs {

    public static void main(String[] args) {

        // autoboxing
        Integer wraper = 9;
        System.out.println(wraper);

        // unboxing

        int unb = 12;
        System.out.println(unb);

        unb = wraper;
        System.out.println(unb);

        Integer first = 1;
        Integer second = 1;

        System.out.println(first == second);
        System.out.println(first.compareTo(second) == 0);
        System.out.println(first.compareTo(1) == 0);
        System.out.println(first.compareTo(2) == 0);

        String numero = "1";
        System.out.println(first.compareTo(Integer.parseInt(numero)) == 0);

        System.out.println("!true = " + (!true));

        System.out.println("true && false = " + (true && false));
        System.out.println("true && true = " + (true && true));
        System.out.println("false && false = " + (false && false));
        System.out.println("true || false = " + (true || false));
        System.out.println("true || true = " + (true || true));
        System.out.println("false || false = " + (false || false));

        System.out.println(DayOfWeek.SATURDAY.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));

        // PAr ou impar

        System.out.println(Double.parseDouble(args[0]) % 2 == 0 ? "Par" : "Impar");


    }
}
