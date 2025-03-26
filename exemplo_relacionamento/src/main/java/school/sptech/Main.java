package school.sptech;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Murilo", "murilo.barbosa@sptech.school","10123456789");

        Musica musica1 = new Musica("Resenha do arrocha", 892, "Eskini");
        Musica musica2 = new Musica("Decidi ai", 230, "Matheus e Kaua");
        Musica musica3 = new Musica("Você não vale nada", 515, "Calcinha preta");

        Playlist playlist1 = new Playlist("ads b", usuario1);

        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);
        playlist1.adicionarMusica(musica3);

        System.out.println(playlist1);

        System.out.println(playlist1.calcularDuracao());
    }
}