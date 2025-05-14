package school.sptech;

public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica("O que é o que é", 300, "Gonzaguinha");
        Musica m2 = new Musica("Magnólia", 400, "Jorge Ben");
        Musica m3 = new Musica("Resenha  do Arrocha", 500, "J Eskine");

        Player player = new Player();

        player.adicionarNaFila(m1);
        player.adicionarNaFila(m2);
        player.adicionarNaFila(m3);

        player.tocandoAgora();
        player.encerrarMusica();

        player.darPlay();

        player.tocandoAgora();
        player.encerrarMusica();
        player.tocandoAgora();
        player.encerrarMusica();

        player.darPause();

        player.tocandoAgora();
        player.encerrarMusica();
        player.tocandoAgora();
    }
}