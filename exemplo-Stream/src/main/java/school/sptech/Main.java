package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>(
                List.of("um", "dois", "tres", "quatro", "cinco")
        );

//        List<String> numerosFiltrados = new ArrayList<>();
//        for (String numero : numeros) {
//            if (numero.contains("o")) {
//                numerosFiltrados.add(numero);
//            }
//        }
//        System.out.println(numerosFiltrados);

        List<String> numerosFiltrados = numeros.stream()
                .filter(numero -> numero.contains("o"))
                .toList();

        System.out.println(numerosFiltrados);

        List<String> numerosGrandes = numeros.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(numerosGrandes);

        Boolean temLetraE = numeros.stream()
                .anyMatch(numero -> numero.contains("e"));

        System.out.println("Encontrei com letra E: " + temLetraE);

        Boolean todoMundoTemLetra = numeros.stream()
                .allMatch(numero -> numero.contains("o"));

        System.out.println("Todos tem a letra O" + todoMundoTemLetra);

        List<Integer> inteiros = new ArrayList<>(
                List.of(40, 12, 4, 6, 50, 99, 36, 0, 6)
        );

        List<Integer> inteirosMaiorQue50 = inteiros.stream()
                .filter(inteiro -> inteiro > 50)
                .toList();

        System.out.println(inteirosMaiorQue50);

        Integer total = inteiros.stream()
                .mapToInt(inteiro -> inteiro)
                .sum();

        System.out.println("Total: " + total);

        Optional<String> nomeOpicional = Optional.ofNullable(null);
        if (nomeOpicional.isPresent()) {
            System.out.println("tem coisa dentro!");
        }

        if (nomeOpicional.isEmpty()) {
            System.out.println("tem nada dentro!");
        }

        String nome = nomeOpicional.orElse("sem nome");
        System.out.println("O nome é: " + nome);

        Double media = inteiros.stream()
                .mapToInt(inteiro -> inteiro)
                .average()
                .orElse(0.0);

        System.out.println("Media: " + media);

        List<Integer> inteirosOrdenados = inteiros.stream()
                .sorted()
                .toList();

        System.out.println(inteirosOrdenados);

        List<String> numerosOrdenados = numeros.stream()
                .sorted()
                .toList();

        System.out.println(numerosOrdenados);

        List<Integer> inteirosOrdenadosSemRepetir = inteiros.stream()
                .distinct()
                .sorted()
                .limit(3)
                .toList();

        System.out.println(inteirosOrdenadosSemRepetir);
    }


}