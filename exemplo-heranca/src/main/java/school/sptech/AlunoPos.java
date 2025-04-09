package school.sptech;

public class AlunoPos extends Aluno {
    private Double notaTcc;

    public AlunoPos(String nome, String ra, Double notaProva, Double notaEntrega, Double notaTcc) {
        super(nome, ra, notaProva, notaEntrega);
        this.notaTcc = notaTcc;
    }

    @Override
    public Double calcularMedia() {
        return (getNotaProva() + getNotaEntrega() + notaTcc) / 3;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }
}
