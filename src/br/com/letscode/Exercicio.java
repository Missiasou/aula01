package br.com.letscode;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        int tamanhoArgs = args.length;
        int primeiro = 0;
        int segundo = 0;

        Scanner input = new Scanner(System.in);

        if (tamanhoArgs == 0){
            System.out.println("Digite o primeiro número: ");
            primeiro = input.nextInt();

            System.out.println("Digite o segundo número: ");
            segundo = input.nextInt();

        } else if (tamanhoArgs == 1){
            primeiro = Integer.parseInt(args[0]);
            System.out.println("Digite o segundo número: ");
            segundo = input.nextInt();
        }
        else if (tamanhoArgs == 2){
            primeiro = Integer.parseInt(args[0]);
            segundo = Integer.parseInt(args[1]);
        }

        if (tamanhoArgs < 3){
            System.out.printf("A soma dos números digitados é: %s",(primeiro+segundo));
        }else{
            System.err.printf("Falha ao fazer a soma de 2 argumentos utilizando %d argumentos", tamanhoArgs);
        }



    }
}
