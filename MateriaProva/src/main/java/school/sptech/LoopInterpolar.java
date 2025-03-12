package school.sptech;

public class LoopInterpolar {

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

        // Interpolação:
        String nome = "Manoel"; //%s
        int idade = 25; //%d
        long numeroGrande = 1000000000L; //%d
        double altura = 1.60; //%f
        float peso = 70.2f; //%f
        char genero = 'M'; //%c
        boolean temCarro = false; //%b

        // `Meu nome é %{nome}, tenho &{idade} anos e %{altura} de altura`

        System.out.println(String.format(
                "meu nome é %s, tenho %d anos e %.2f de altura"
                , nome, idade, altura));
    }
}
