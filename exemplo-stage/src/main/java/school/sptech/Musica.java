package school.sptech;

public class Musica {
    private String nome;
    private Integer duracao;
    private String artista;

    public Musica(String nome, Integer duracao, String artista) {
        this.nome = nome;
        this.duracao = duracao;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", artista='" + artista + '\'' +
                '}';
    }
}
