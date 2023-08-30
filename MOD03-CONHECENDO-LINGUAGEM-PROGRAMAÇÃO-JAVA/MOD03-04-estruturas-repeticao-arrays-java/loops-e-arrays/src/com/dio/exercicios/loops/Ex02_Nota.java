package com.dio.exercicios.loops;

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

        /*  RESPOSTA LUCIANO, (deu certo, porém o código pode ser mais clean
        while(true){
            System.out.println("Digite a nota do Aluno:");
            nota = scanner.nextInt();
            if((nota >=0) && (nota<=10)) {
                System.out.println("Nota informada com sucesso!!!");
                break;
            } else{
            System.out.println("Nota, inválida, tente novamente!!!");
            }
        */

        // CORREÇÃO C/ SINTAXE MAIS CLEAN
        System.out.println("Informe a nota do aluno: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida, tente novamente!");
            nota = scanner.nextInt();

            System.out.println("Nota inválida, tente novamente!");

        }

            System.out.println("Nota validada com sucesso!!!");

    }
}
