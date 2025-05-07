package school.sptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer valor = null;

        do {
            try {
            System.out.println("Digite o valor da carta");
            valor = leitor.nextInt();
            } catch (InputMismatchException e) {
                leitor.next();
            }
        } while (valor == null || valor < 1 || valor > 13);

        String naipe = null;
        int valorNaipe = 0;

        do {
            System.out.println("Digite o naipe da carta");
            naipe = leitor.next();
            naipe = naipe.toUpperCase();

            switch (naipe) {
                case "OUROS" -> valorNaipe = 1;
                case "ESPADAS" -> valorNaipe = 2;
                case "COPAS" -> valorNaipe = 3;
                case "PAUS" -> valorNaipe = 4;
            }
        } while (valorNaipe == 0);

        Carta carta = null;

        for (Simbolo simboloDaVez : Simbolo.values()) {
            for (Naipe naipeDaVez : Naipe.values()) {
                if (simboloDaVez.getValor().equals(valor) && naipeDaVez.getValor().equals(valorNaipe)) {
                    carta = new Carta(simboloDaVez, naipeDaVez);
                }
            }
        }

        Simbolo simbolo = Simbolo.fromInteger(valor);

        System.out.println(carta);

        // baseado em "valor" e "naipe" criar uma nova carta

    }
}
