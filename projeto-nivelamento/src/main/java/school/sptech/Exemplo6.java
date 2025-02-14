package school.sptech;

public class Exemplo6 {

    public static void main(String[] args) {

        String nome = "Manoel";
        int idade = 25;
        long numeroGrande = 1000000000L;
        double altura = 1.60;
        float peso = 70.2f;
        char genero = 'M';
        boolean temCarro = false;

        // `Meu nome é %{nome}, tenho &{idade} anos e %{altura} de altura`

        System.out.println(String.format(
                "meu nome é %s, tenho %d anos e %.2f de altura"
                , nome, idade, altura));
    }
}
