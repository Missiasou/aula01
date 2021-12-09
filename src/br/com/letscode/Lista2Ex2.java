package br.com.letscode;

import java.util.Scanner;

public class Lista2Ex2 {

    public static void main(String[] args) {
        double num = 0;
        double result = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o número: %n");
        num = input.nextDouble();

        for (int i = 0; i < 11 ; i++) {

            System.out.printf("%s x %s = %s %n", num, i, result=num*i);
        }

        input.close();
    }
}
