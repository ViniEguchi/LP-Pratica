package school.sptech;

public class Aluno {
    private String nome;
    private String Ra;
    private Double notaProva;
    private Double notaEntrega;

    public Aluno(String nome, String ra, Double notaProva, Double notaEntrega) {
        this.nome = nome;
        Ra = ra;
        this.notaProva = notaProva;
        this.notaEntrega = notaEntrega;
    }

    public Double calcularMedia() {
        return (notaProva + notaEntrega) / 2.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return Ra;
    }

    public void setRa(String ra) {
        Ra = ra;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }

    public Double getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(Double notaEntrega) {
        this.notaEntrega = notaEntrega;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", Ra='" + Ra + '\'' +
                ", notaProva=" + notaProva +
                ", notaEntrega=" + notaEntrega +
                '}';
    }
}
