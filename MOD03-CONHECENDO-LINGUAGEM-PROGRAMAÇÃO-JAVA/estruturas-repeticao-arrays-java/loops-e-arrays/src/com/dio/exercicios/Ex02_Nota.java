package com.dio.exercicios;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre 0 e 10,
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que
o usuário informe o valor válido.
*/

public class Ex02_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        while(true){
            System.out.println("Digite a nota do Aluno:");
            nota = scanner.nextInt();
            if((nota >=0) && (nota<=10)) {
                System.out.println("Nota informada com sucesso!!!");
                break;
            } else{
            System.out.println("Nota, inválida, tente novamente!!!");
            }



        }
    }
}
