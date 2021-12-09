package br.com.letscode;

import java.util.Scanner;

public class Ex2_0812 {

    public static void main(String[] args) {
        int turmas,quantidade;
        double somaNotasTurma = 0;
        double somaNotasTotal = 0;
        double[][] matrixTurmas;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de turmas: ");
        turmas = input.nextInt();
        System.out.println("Digite a quantidade de alunos: ");
        quantidade = input.nextInt();

        matrixTurmas = new double[turmas][quantidade];

        for(int i = 0; i < turmas;i++){
            System.out.printf("Turma %d%n",i+1);
            for(int j = 0; j < quantidade;j++){
                System.out.println("Nota do aluno: ");
                matrixTurmas[i][j] = input.nextDouble();
                somaNotasTurma += matrixTurmas[i][j];
                somaNotasTotal += somaNotasTurma;
            }
            System.out.printf("%nMedia da Turma %d é : %.2f%n",i+1,somaNotasTurma/quantidade);
            somaNotasTurma = 0;
        }

        System.out.printf("Media total das Turmas: %.2f",somaNotasTotal/(quantidade*turmas));

        input.close();
    }
}
