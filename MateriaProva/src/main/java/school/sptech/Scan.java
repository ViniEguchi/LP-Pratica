package school.sptech;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        Double nota1;
        Double nota2;
        Double nota3;

        do {
            System.out.println("Digite a primeira nota:");
            nota1 = leitor.nextDouble();
        } while (nota1 > 10 || nota1 < 0);

        do {
            System.out.println("Digite a segunda nota:");
            nota2 = leitor.nextDouble();
        } while (nota1 > 10 || nota1 < 0);

        do {
            System.out.println("Digite a terceira nota:");
            nota3 = leitor.nextDouble();
        } while (nota1 > 10 || nota1 < 0);

        Auxiliar ovo = new Auxiliar();

        Double media = ovo.calcularMedia(nota1, nota2, nota3);

        System.out.println(nome);
        ovo.exibiMensagem(String.format("%.2f", media));
    }
}

