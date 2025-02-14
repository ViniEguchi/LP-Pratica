package school.sptech;

public class Exemplo4 {

    public static void main(String[] args) {

        System.out.println("For de 0 a 9");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("While de 0 a 9");
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("Do while de 0 a 9");
        contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);

        // o While roda primeiro a condição e depois o codigo, o Do While faz o contrario
        // Do while vai rodar sempre pelo menos 1 vez
    }
}
