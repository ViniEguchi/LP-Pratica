package school.sptech;

import java.util.Arrays;

public class Vetor {

    public static void main(String[] args) {

        Integer tamanho = 5;

        int[] vetor = new int[tamanho];
        Integer[] oVetor = new Integer[tamanho];

//        vetor = new int[tamanho];
//        oVetor = new Integer[tamanho];

        System.out.println(Arrays.toString(vetor));
        System.out.println(Arrays.toString(oVetor));

        Integer[] vetorInicializado = { 10, 20, 30, 40, 50 };

        vetorInicializado[4] = 80;

        System.out.println(vetorInicializado[2]);

        System.out.println(Arrays.toString(vetorInicializado));

        System.out.println("Iterando o vetor");
//        lista.fori
        for (int i = 0; i < vetorInicializado.length; i++) {

            System.out.println(vetorInicializado[i]);
        }

        System.out.println("Iterando for aprimorado");
//        lista.for
        for (Integer i : vetorInicializado) {

            System.out.println(i);
        }

        System.out.println("Interando reverso");
//        lista.forr
        for (int i = vetorInicializado.length - 1; i >= 0; i--) {

            System.out.println(vetorInicializado[i]);
        }
    }
}
