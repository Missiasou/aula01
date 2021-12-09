package br.com.letscode;

import java.util.Scanner;

public class Lista2Ex5 {
    public static void main(String[] args) {

        double num = 0;
        double fatorPolegada = 2.54;

        Scanner input = new Scanner(System.in);


        System.out.printf("Digite quantas polegadas você deseja transformar em centímetros %n");
        num = input.nextDouble();

        double centimetro = num * fatorPolegada;

        System.out.printf(" %s polegadas equivalem a %s centímetros %n", num, centimetro);

        input.close();


    }

}
