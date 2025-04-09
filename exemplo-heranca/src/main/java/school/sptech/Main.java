package school.sptech;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Manoel", "01192021", 6.0, 7.0);

        Faculdade sptech = new Faculdade("SPTech");
        AlunoPos alunoPos = new AlunoPos("Murillo", "01222929", 8.0, 8.0, 10.0);

        sptech.matricular(aluno);
        sptech.matricular(alunoPos);

        System.out.println(sptech);

        sptech.exibirMedias();

        sptech.exibirNotasTcc();
    }
}