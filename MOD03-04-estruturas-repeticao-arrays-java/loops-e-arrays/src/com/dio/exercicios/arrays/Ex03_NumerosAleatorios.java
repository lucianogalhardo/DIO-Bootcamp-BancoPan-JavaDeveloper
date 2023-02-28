package com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que leia 20 números inteiros aleatórios entre (0 e 100)
armazene-os em um vetor. ao final mostre os números e seus sucessores.
 */
public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();


        int[] numerosAleatorios = new int[20];


        for (int i = 0 ; i < numerosAleatorios.length ; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;


        }
        System.out.println("Números aleatórios e sucessores: ");
        for ( int numero : numerosAleatorios ) {
            System.out.println(numero + " Sucessor ===> " + (numero + 1));

        }



    }
}
