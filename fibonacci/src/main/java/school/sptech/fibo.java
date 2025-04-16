package school.sptech;

import java.io.InputStream;
import java.util.Scanner;

public class fibo {

    public static void calcularFibo(int qtd) {
        qtd -= 2;
        int n1 = 1;
        int n2 = 1;

        System.out.println("\n" + 1);
        System.out.println(1);

        for (int i = 0; i < qtd; i++) {
            if (n1 > n2) {
                n2 = n1 + n2;
                System.out.println(n2);
            } else {
                n1 = n2 + n1;
                System.out.println(n1);
            }
        }
    }
}
