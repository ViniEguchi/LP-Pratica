package school.sptech;

public class Main {
    public static void main(String[] args) {
//        try {
//            String nome = null;
//            System.out.println("Seu nome em CAPS LOCK é: " + nome.toUpperCase());
//        } catch (NullPointerException e) {
//            System.out.println("Seu nome está nulo!");
//        }

        Usuario usuario = new Usuario("Jose", " ", "123");
        System.out.println("Usuario criado: " + usuario);

        try {
            Usuario usuario2 = new Usuario("email@email.com", "123");
        } catch (Exception e) {
            System.out.println("Deu Ruim!");
        }
    }
}