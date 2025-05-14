package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Musica> fila;
    private Integer musicaAtual;
    private PlayerState state;

    public Player() {
        this.fila = new ArrayList<>();
        this.musicaAtual = 0;
        this.state = new PlayerParadoState(this);
    }

    public void adicionarNaFila(Musica musica) {
        this.fila.add(musica);
    }

    public void tocandoAgora() {
        this.state.tocandoAgora();
//        if (fila.isEmpty()) {
//            System.out.println("Fila vazia");
//            return;
//        }
//
//        System.out.println(this.fila.get(musicaAtual));
    }

    public void encerrarMusica() {
        this.state.encerrarMusica();
//        if (musicaAtual + 1 >= fila.size()) {
//            System.out.println("Não há uma próxima música");
//            return;
//        }
//
//        musicaAtual++;
    }

    public void darPlay() {
        this.state.darPlay();
    }

    public void darPause() {
        this.state.darPause();
    }

    public List<Musica> getFila() {
        return fila;
    }

    public void setFila(List<Musica> fila) {
        this.fila = fila;
    }

    public Integer getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(Integer musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }
}
