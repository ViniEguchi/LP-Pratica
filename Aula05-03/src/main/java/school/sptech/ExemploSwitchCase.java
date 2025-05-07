package school.sptech;

import java.util.Scanner;

public class ExemploSwitchCase {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        Integer diaDaSemana = leitor.nextInt();

        String mensagem = switch (diaDaSemana) {
            case 1, 7 -> "Final de Semana";
            case 2 -> "Segunda-Feira";
            case 3 -> "Terça-Feira";
            case 4 -> "Quarta-Feira";
            case 5 -> "Quinta-Feira";
            case 6 -> "Sexta-Feira3";
            default -> "Dia da semana inválido";
        };

        System.out.println(mensagem);

//      if (diaDaSemana == 1) {
//          System.out.println("Domingo");
//      } else if (diaDaSemana == 2) {
//          System.out.println("Segunda");
//      } else if (diaDaSemana == 3) {
//          System.out.println("Terça");
//      } else if (diaDaSemana == 4) {
//          System.out.println("Quarta");
//      } else if (diaDaSemana == 5) {
//          System.out.println("Quinta");
//      } else if (diaDaSemana == 6) {
//          System.out.println("Sexta");
//      } else if (diaDaSemana == 7) {
//          System.out.println("Sabado");
//      } else {
//          System.out.println("dia da semana inválido");
//      }
    }
}
