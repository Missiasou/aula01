package br.com.letscode;

import java.util.Scanner;

public class Exercicio1_0612 {
    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;
        String operacao = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número");
        num2 = input.nextDouble();

        System.out.println("Digite qual a operração que você deseja fazer (adição: +, subtração: -, divisão: / ou multiplicação: *)");
        operacao = input.next();

        switch (operacao){
            case "+" :
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.err.println("Insira uma operação válida");
        }

        input.close();

    }


}
