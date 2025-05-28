package school.sptech;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploSorte {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Zumira", 50, 10.0);
        Aluno aluno2 = new Aluno("Bob", 20, 8.0);
        Aluno aluno3 = new Aluno("Ana", 36, 7.50);
        Aluno aluno4 = new Aluno("Marcelo", 45, 2.89);
        Aluno aluno5 = new Aluno("Vivian", 92, 0.0);

        List<Aluno> alunos = new ArrayList<>(
                List.of(aluno1, aluno2, aluno3, aluno4, aluno5)
        );

        List<Aluno> alunosOrdenados = alunos.stream()
                .sorted(Comparator.comparing(Aluno::getNome))
                .toList();

        System.out.println(alunosOrdenados);

        List<Aluno> alunosInverso = alunos.stream()
                .sorted(Comparator.comparing(Aluno::getNome))
                .toList()
                .reversed();

        System.out.println(alunosInverso);

        List<String> desafio = alunos.stream()
                .filter(aluno -> aluno.getIdade() > 20)
                .sorted(Comparator.comparing(Aluno::getIdade))
                .limit(3)
                .map(aluno -> aluno.getNome().toUpperCase())
                .toList();

        System.out.println(desafio);
    }
}
