package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private Usuario usuario;
    private List<Musica> musicas;

    public Playlist(String nome, Usuario usuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica novaMusica) {
        this.musicas.add(novaMusica);
    }

    public Integer calcularDuracao() {
        Integer soma = 0;

        for (Musica musicaDaVez : this.musicas) {
            soma += musicaDaVez.getDuracao();
        }

        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", usuario=" + usuario +
                ", musicas=" + musicas +
                '}';
    }
}
