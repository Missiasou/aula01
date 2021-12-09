package br.com.letscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ExemploIO {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();

        System.out.println("args = " + args);
        System.out.printf("Olá %td %tB %ty %tT ", date, date, date, date);

       // System.err.println("Se quiser fazer uma mensagem de erro");

        int primeiro;
        int segundo;
        int soma;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");

        primeiro = input.nextInt();

        System.out.println("Digite um segundo número: ");
        segundo = input.nextInt();

        System.out.printf("O primeiro número digitado foi: %s e o segundo foi: %s  ", primeiro, segundo);

        soma = primeiro + segundo;
        System.out.printf("A soma deles é: %s", soma);

        // ou pode jogar direto:

        System.out.printf("usando diretor no print %s", (primeiro + segundo));

        int b = (int) (Math.random() * 10);

        if(b < 3){
            System.out.println("baixo");
        }
        if(b > 6){
            System.out.println("auto");
        }
        if (b % 2 == 0){
            System.out.println("Número Par");
        }
    }
}
