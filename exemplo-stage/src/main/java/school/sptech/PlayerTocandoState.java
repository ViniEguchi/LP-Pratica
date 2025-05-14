package school.sptech;

public class PlayerTocandoState extends PlayerState {
    public PlayerTocandoState(Player player) {
        super(player);
    }

    @Override
    public void tocandoAgora() {
        if (this.getPlayer().getFila().isEmpty()) {
            System.out.println("Fila vazia");
            return;
        }

        Integer musicaAtual = this.getPlayer().getMusicaAtual();
        System.out.println(this.getPlayer().getFila().get(musicaAtual));
    }

    @Override
    public void encerrarMusica() {
        Integer musicaAtual = this.getPlayer().getMusicaAtual();
        if (musicaAtual + 1 >= this.getPlayer().getFila().size()) {
            System.out.println("Não há uma próxima música");
            this.getPlayer().setState(new PlayerParadoState(this.getPlayer()));
            this.getPlayer().setMusicaAtual(0);
            return;
        }

        this.getPlayer().setMusicaAtual(musicaAtual + 1);
    }

    @Override
    public void darPlay() {
        System.out.println("O player já está tocando");
    }

    @Override
    public void darPause() {
        this.getPlayer().setState(new PlayerParadoState(this.getPlayer()));
    }
}
