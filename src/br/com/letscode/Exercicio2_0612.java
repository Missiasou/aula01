package br.com.letscode;

import java.util.Scanner;

public class Exercicio2_0612 {

    public static void main(String[] args) {
        double media = 0;
        int quantidade = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da nota: ");
        double valorEntrada = entrada.nextDouble();

        while (valorEntrada >= 0) {
            if (valorEntrada <= 10) {
                media += valorEntrada;
                quantidade++;
            } else {
                System.err.println("Valor digitado deve ser menor que 10.");
            }
            System.out.println("Digite o valor da nota: ");
            valorEntrada = entrada.nextDouble();
        }

        if (quantidade == 0) {
            System.err.println("Nenhum valor digitado para fazer o cálculo de média.");
        } else {
            System.out.printf("O resultado da média das %d provas é de %.2f", quantidade, media / quantidade);
        }

        entrada.close();

    }
}
