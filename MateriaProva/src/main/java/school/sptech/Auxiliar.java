package school.sptech;

public class Auxiliar {

    // Olhar a Main para rodar o Auxiliar
    void exibiMensagem(String texto) {
        System.out.println("=".repeat(texto.length()));
        System.out.println(texto);
        System.out.println("-".repeat(texto.length()));
    }

    Integer somar(Integer a, Integer b) {
        return a + b;
    }

    //crie um método chamado calcularMedia
    //que recebe 3 notas e retorna a média

    Double calcularMedia(Double nota1, Double nota2, Double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    Double calcularMedia(Double nota1, Double nota2, Double nota3, Double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
