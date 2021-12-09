package br.com.letscode;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello World");

        double kilo = 100;
        double fatorEmLibras = 2.20462;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite qtos kilos vc deseja transformar: ");
        kilo = input.nextInt();

        System.out.printf("O valor digitado foi %s que vale %s em libras", kilo, (kilo * fatorEmLibras));
    }
}

