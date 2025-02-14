package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exemplo7 {

    public static void main(String[] args) {

        Integer numeroAleatorio =
                ThreadLocalRandom.current().nextInt(10 ,20);

        System.out.println(numeroAleatorio);

        Double numeroRealAleatorio =
                ThreadLocalRandom.current().nextDouble(20);

        System.out.println(numeroRealAleatorio);
    }
}
