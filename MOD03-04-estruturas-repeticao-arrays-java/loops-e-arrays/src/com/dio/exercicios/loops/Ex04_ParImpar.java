package com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade
de números ímpares.
 */
public class Ex04_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int qtdNum = 0;
        int contPar = 0;
        int contImpar = 0;
        int cont = 0;

        System.out.println("Informe a Quantide de números para análise");
        qtdNum = scan.nextInt();

        do{
            System.out.println("Informe um número");
            numero = scan.nextInt();

            if(numero % 2 == 0) contPar = contPar + 1;
                else contImpar = contImpar + 1;

            cont = cont + 1;
        }
        while (cont < qtdNum);
        {

            System.out.println("Total numeros: " + cont);
            System.out.println("Total numeros Pares: " + contPar);
            System.out.println("Total numeros Impares: " + contImpar);


        }
    }
}
