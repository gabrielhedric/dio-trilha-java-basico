package br.com.dio.exercicios.repeticao;

/*
* Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido
* e coninue pedindo até que o usuário informe um valor valido
* */

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota válida:");
        nota = scan.nextInt();

        while(nota > 10) {
            System.out.println("Valor errado, digite uma nota válida:");
            nota = scan.nextInt();
        }


    }
}
