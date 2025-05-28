package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ExemploMap {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Zumira", 50, 10.0);
        Aluno aluno2 = new Aluno("Bob", 20, 8.0);
        Aluno aluno3 = new Aluno("Ana", 36, 7.50);
        Aluno aluno4 = new Aluno("Marcelo", 45, 2.89);
        Aluno aluno5 = new Aluno("Vivian", 92, 0.0);

        List<Aluno> alunos = new ArrayList<>(
                List.of(aluno1, aluno2, aluno3, aluno4, aluno5)
        );

        List<Estagiario> estagiarios = alunos.stream()
                .map(aluno -> new Estagiario(aluno.getNome(), aluno.getIdade()))
                .toList();

        System.out.println(estagiarios);

        List<Estagiario> estagiariosNotaAlta = alunos.stream()
                .filter(aluno -> aluno.getNota() > 8)
                .map(aluno -> new Estagiario(aluno.getNome(), aluno.getIdade()))
                .toList();

        System.out.println(estagiariosNotaAlta);
    }
}
