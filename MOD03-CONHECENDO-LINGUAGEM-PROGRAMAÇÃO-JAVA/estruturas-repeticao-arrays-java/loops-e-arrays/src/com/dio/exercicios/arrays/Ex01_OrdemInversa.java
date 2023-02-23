package com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os em ordem inversa.
 */
public class Ex01_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("vetor: ");
        int cont = 0;

        while (cont < (vetor.length)) {
            System.out.print(vetor[cont] + " ");
            cont++;
        }
        System.out.print("\nvetor: ");
        for (int i=(vetor.length-1); i >= 0; i--)
            System.out.print(vetor[i] + " ");

    }



    }
