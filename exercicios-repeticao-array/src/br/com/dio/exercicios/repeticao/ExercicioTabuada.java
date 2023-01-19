package br.com.dio.exercicios.repeticao;

/*
* Desenvolva um gerador de tabuada, capaz de gerar a tabuada
* de qualquer numero inteiro entre 1 a 10.
* O usuário deve informar de qual numero ele deseja ver a
* tabuada. A saida deve ser conforme o exemplo abaixo:
*
* */

import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Digite o número que você deseja ver a tabuada: ");
        tabuada = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }


    }
}
