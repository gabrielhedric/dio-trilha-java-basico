package br.com.dio.exercicios.arrays;

public class ExercicioOrdemInversa {
    public static void main(String[] args) {

        int[] listaNumeros = {1, 2, 1, 4, 5, 6};

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println(listaNumeros[i]);
        }

        for(int i = listaNumeros.length-1; i >= 0; i--){
            System.out.println(listaNumeros[i]);
        }

    }
}
