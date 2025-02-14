package school.sptech;

public class Exemplo2 {

    public static void main(String[] args) {

        Integer idade = 25;

        if (idade < 16) {
            System.out.print("Não pode votar, nem dirigir");
        } else if (idade < 18) {
            System.out.print("Pode votar, mas não pode dirigir");
        } else {
            System.out.print("Já pode votar e dirigir");
        }

        String mensagem = idade >= 16
                ? "Pode votar" : "Não pode votar";
    }
}
