package br.com.dio.exercicios.repeticao;

/*
* Faça um programa que leia 5 numeros
* e informe o maior numero
* e a media desses números
* */

import java.util.Scanner;

public class ExercicioMaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maiorNumero = 0;
        int valorTotal = 0;
        int media;

        /* do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if(numero > maiorNumero) maiorNumero = numero;
            valorTotal = valorTotal + numero;
            count++;
        } while(count < 5);
        System.out.println("O maior número é: " + maiorNumero);
        media = valorTotal / 5;
        System.out.println("A média desses valores é: " + media);

         */

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if(numero > maiorNumero) maiorNumero = numero;
            valorTotal = valorTotal + numero;
            System.out.println("O maior número é: " + maiorNumero);
        }
        media = valorTotal / 5;
        System.out.println("A média desses valores é: " + media);
    }
}
