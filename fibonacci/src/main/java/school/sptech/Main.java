package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de números da sequencia de Fibonacci");
        int qtd = leitor.nextInt();

        fibo.calcularFibo(qtd);
    }
}