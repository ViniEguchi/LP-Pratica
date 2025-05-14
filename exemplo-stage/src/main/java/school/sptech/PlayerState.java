package school.sptech;

public abstract class PlayerState {
    private final Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public abstract void tocandoAgora();

    public abstract void encerrarMusica();

    public abstract void darPlay();

    public abstract void darPause();

    public Player getPlayer() {
        return player;
    }
}
