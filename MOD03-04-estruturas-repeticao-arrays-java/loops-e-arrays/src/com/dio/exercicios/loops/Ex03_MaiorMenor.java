package com.dio.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe:
o MAIOR numero e a MÉDIA desses números:
 */
public class Ex03_MaiorMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int cont = 0;
        int maior = 0;
        int media=0;
        int soma = 0;

        do {
            System.out.println("Informe número: ");
            num = scan.nextInt();

            soma = soma + num;

            if (num > maior) maior = num;

            cont = cont + 1;


        }
        while(cont <5);{
        media = soma / cont;

        System.out.println("Quantidade de números: " + cont);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + media);


        }




    }
}
