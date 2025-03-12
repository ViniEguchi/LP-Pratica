package school.sptech;

public class Exemplo6 {

    public static void main(String[] args) {

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
