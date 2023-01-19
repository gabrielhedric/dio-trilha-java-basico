package br.com.dio.desafios.java;

import java.util.Scanner;

public class MesadaSobrinho {
    public static void main(String[] args) {

        System.out.println("Quantos meses você irá guardar? ");
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;



        int valorTotal = mesada * entrada;
        System.out.println(entrada + " Voce tera " + valorTotal + " reais ");

    }
}
