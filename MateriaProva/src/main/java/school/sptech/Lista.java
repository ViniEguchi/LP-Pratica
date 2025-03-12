package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<Integer> lista =new ArrayList<>();

//        lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(1, 70);
        lista.set(2, 99);
        Integer valor = 70;
        lista.remove(valor);

        System.out.println(lista);

//      pegar um valor pelo index
        System.out.println(lista.get(1));

        List<String> frutas = new ArrayList<>(List.of("Fruta Pão", "Banana"));
        frutas.add("Laranja");
        frutas.add("Pera");
        frutas.add("Goiaba");
        frutas.add("Maçã");
        frutas.addAll(List.of("Tomate", "Melão"));

        System.out.println(frutas);

        for (int i = 0; i < frutas.size(); i++) {

            System.out.println(frutas.get(i));
        }
    }
}
