package br.com.dio.exercicios.repeticao;

import java.util.Scanner;
/*
* Faça um programa que leia conjunto de dois valores,
* o primeiro representando o nome do aluno e o segundo representando a sua idade
* (Pare o programa inserindo o valor 0 no campo nome)
* */
public class ExercicioUm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeAluno;
        int idadeAluno;

        while(true) {
            System.out.println("Nome: ");
            nomeAluno = scan.next();
            if(nomeAluno.equals("0")) break;
            System.out.println("Idade: ");
            idadeAluno = scan.nextInt();
        }
    }
}
