package school.sptech;

public class PlayerParadoState extends PlayerState {
    public PlayerParadoState(Player player) {
        super(player);
    }

    @Override
    public void tocandoAgora() {
        System.out.println("O player está parado!");
    }

    @Override
    public void encerrarMusica() {
        System.out.println("O player está parado!");
    }

    @Override
    public void darPlay() {
        this.getPlayer().setState(new PlayerTocandoState(this.getPlayer()));
    }

    @Override
    public void darPause() {
        System.out.println("O player já está parado");
    }
}
