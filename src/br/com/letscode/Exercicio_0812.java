package br.com.letscode;

import java.util.Scanner;

public class Exercicio_0812 {

    public static void main(String[] args) {
        int n = 0;
        double vetor [];
        double media =0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        n = input.nextInt();
        vetor = new double [n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite a nota do aluno " + i);
            vetor[i] = input.nextDouble();

        }


        for (double nota: vetor
             ) {
            media += nota;

        }

        media /= n;

        System.out.println("A média foi: " + media);

        input.close();

    }

}
