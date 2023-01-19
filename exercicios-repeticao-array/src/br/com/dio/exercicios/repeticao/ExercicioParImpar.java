package br.com.dio.exercicios.repeticao;

import java.util.Scanner;

/* Faça um programa que leia N numeros inteiros
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares
se o resto da divisao for 0 numero par
se o resto da divisao for maior que 0 impar
*/
public class ExercicioParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int numerosPares = 0, numerosImpares = 0;

        System.out.println("Digite a quantidade de números que vamos calcular:");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
       /* do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if(numero %2 == 0 ) {
                System.out.println("Esse número é par: " + numero);
                numerosPares++;
            } else {
                System.out.println("Esse número é impar: " + numero);
                numerosImpares++;
            }
            count++;
        } while(count < quantidadeNumeros);

        */

        for(int i = 0; i < quantidadeNumeros; i++){
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if(numero %2 == 0 ) {
                System.out.println("Esse número é par: " + numero);
                numerosPares++;
            } else {
                System.out.println("Esse número é impar: " + numero);
                numerosImpares++;
            }
        }

        System.out.println("Quantidade Par: " + numerosPares);
        System.out.println("Quantidade Impar: " + numerosImpares);
    }
}
