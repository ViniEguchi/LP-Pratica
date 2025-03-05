package school.sptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer numero1 = null;
        Integer numero2 = null;
        do {

            try {
                System.out.println("Digite um número inteiro");
                numero1 = leitor.nextInt();

                System.out.println("Digite outro número inteiro");
                numero2 = leitor.nextInt();

                System.out.println("A divisão é: " + (numero1 / numero2));
            } catch (InputMismatchException e) {
                leitor.next();
                System.out.println("Número inválido");
            } catch (ArithmeticException e) {
                System.out.println("Não pode dividir por 0");
            }
        } while (numero1 == null);
    }
}