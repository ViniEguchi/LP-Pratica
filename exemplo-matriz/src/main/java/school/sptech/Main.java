package school.sptech;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Integer[] vetor = new Integer[3];
//        vetor[0] = 1;
//        vetor[1] = 2;
//        vetor[2] = 3;

//        Integer[] vetor = {1, 2, 3};
//        System.out.println(Arrays.toString(vetor));

        Integer[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(matriz));
        System.out.println(matriz[1][1]);
        System.out.println(matriz[2][2] + "\n");

//        for (int i = 0; i < matriz.length; i++) {
//            Integer[] vetorDaVez = matriz[i];
//            for (int j = 0; j < vetorDaVez.length; j++) {
//                System.out.println(vetorDaVez[j]);
//            }
//        }

//        for (Integer[] vetorDaVez : matriz) {
//            for (Integer integer : vetorDaVez) {
//                System.out.println(integer);
//            }
//        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}