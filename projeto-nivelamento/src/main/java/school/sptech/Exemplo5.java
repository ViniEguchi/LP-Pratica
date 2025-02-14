package school.sptech;

public class Exemplo5 {

    public static void main(String[] args) {

        Integer num1 = 10;
        Integer num2 = 4;

        // +, -, /, *, %, (**)

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Divisão: " + (num1 / num2.doubleValue()));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Resto da divisão: " + (num1 % num2));
        System.out.println("Potenciação: " + (Math.pow(num1, num2)));
    }
}
