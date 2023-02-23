package com.dio.exercicios.loops;

import java.util.Scanner;
/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro de 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
....
5 x 10 = 50
 */
public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Informe qual tabuada deseja gerar: ");
        tabuada = scan.nextInt();
        System.out.println("Tabuada de: " + tabuada);

        for ( int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X "+ i + " = " + (tabuada * i));
        }
    }
}
