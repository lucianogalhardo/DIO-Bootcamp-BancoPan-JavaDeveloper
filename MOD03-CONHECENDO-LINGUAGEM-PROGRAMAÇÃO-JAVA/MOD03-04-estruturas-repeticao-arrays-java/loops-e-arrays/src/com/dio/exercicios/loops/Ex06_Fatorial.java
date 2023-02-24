package com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Exemplo:
5! = 5.4.3.2.1 = 120
 */
public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe número para fatorial: ");
        int num = scan.nextInt();
        int multiplicador = 1;

        System.out.print(num + "! = ");
        for (int i = num; i >= 1; i --){
            multiplicador = multiplicador * i;

        }

        System.out.println(multiplicador);



    }
}
