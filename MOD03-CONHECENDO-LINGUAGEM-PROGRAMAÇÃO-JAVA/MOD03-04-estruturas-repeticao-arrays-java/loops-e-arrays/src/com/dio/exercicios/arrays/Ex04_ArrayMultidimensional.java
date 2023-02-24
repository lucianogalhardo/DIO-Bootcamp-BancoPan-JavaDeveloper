package com.dio.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz 4x4 com valores aleatórios entre 0-9.
após isso determine o menor numero da matriz e a sua posição (linha, coluna)
 */
public class Ex04_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[] [] M = new int[4][4];
        int menor = 0;
        int linha1 = 0;
        int coluna1 = 0;

        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
                if (M[i][j] < menor)
                    menor = M[i][j];
                    linha1 = i;
                    coluna1 = j;

            }
        }
        System.out.println("Matriz: ");
        for ( int []  linha : M ) {
            for ( int coluna  : linha  ) {
                System.out.print(coluna + " ");

            }
            System.out.println();
        }
        System.out.println("Menor numero: " + menor);
        System.out.println("Linha: " + linha1);
        System.out.println("Coluna: " + coluna1);
    }
}
