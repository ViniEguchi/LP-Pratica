package school.sptech;

public class Exemplo3 {

    public static void main(String[] args) {

        String nome1 = "Manoel";
        String nome2 = new String ("Manoel");

        if (nome1.equals(nome2)) {
            System.out.println("Somos iguais");
        } else {
            System.out.println("Não somos iguais");
        }
    }
}
