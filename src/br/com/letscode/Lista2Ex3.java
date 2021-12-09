package br.com.letscode;

import java.util.Scanner;

public class Lista2Ex3 {

    public static void main(String[] args) {

        final double fator1 = 9.0 / 5;
        final double fator2 = 32;
        double celsius = 0;


        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a temperatura em celsius: %n");
        celsius = input.nextDouble();
        double fahrenheit = (celsius * fator1) + fator2;

        System.out.printf("%f Celsius é igual a %f Fahrenheit%n", celsius, fahrenheit);
    }
    }

