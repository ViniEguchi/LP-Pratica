package school.sptech;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirMedias() {
        for (Aluno alunoDaVez : this.alunos) {
            System.out.printf("Média do aluno (%s): %.2f\n", alunoDaVez.getNome(), alunoDaVez.calcularMedia());
        }
    }

    public void exibirNotasTcc() {
        for (Aluno alunoDaVez : this.alunos) {
            if (alunoDaVez instanceof AlunoPos alunoPos) {
                System.out.printf("TCC do aluno (%s): %.2f\n", alunoDaVez.getNome(), alunoPos.getNotaTcc());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "faculdade{" + "nome='" + nome + '\'' + ", alunos=" + alunos + '}';
    }
}
