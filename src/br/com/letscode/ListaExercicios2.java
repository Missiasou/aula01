package br.com.letscode;

import java.util.Scanner;

public class ListaExercicios2 {

    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double soma = 0;
        double subtracao = 0;
        double multiplic = 0;
        double divisao = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: %n");
        num1 = input.nextDouble();

        System.out.printf("Digite o segundo número: %n");
        num2 = input.nextDouble();

        System.out.printf("A soma de %s e %s é %s %n", num1, num2, soma = num1 + num2);
        System.out.printf("A subtração de %s e %s é %s %n", num1, num2, subtracao = num1 - num2);
        System.out.printf("A Multiplicação de %s e %s é %s %n", num1, num2, multiplic = num1 * num2);

        if (num2 == 0) {
            System.err.println("Não há resposta para a divisão por 0(zero)");
        } else {
            System.out.printf("A Divisão de %s e %s é %s %n", num1, num2,divisao = num1 / num2);
        }
    }}
