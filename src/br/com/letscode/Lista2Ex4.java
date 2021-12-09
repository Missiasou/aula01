package br.com.letscode;

import java.util.Scanner;

public class Lista2Ex4 {

    public static void main(String[] args) {

        double real = 0;
        double dolar = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o valor da cotação do dolár do dia %n");
        dolar = input.nextDouble();

        System.out.printf("Digite quantos reais você deseja transformar %n");
        real = input.nextDouble();

        double result = real / dolar;

        System.out.printf("R$ %s reais equivalem a $ %s doláres %n", real, result);

        input.close();

    }
}
