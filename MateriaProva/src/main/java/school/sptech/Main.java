package school.sptech;

public class Main {

    public static void main(String[] args) {

        // chama funções de outros arquivos
        Auxiliar bacon = new Auxiliar();

        bacon.exibiMensagem("Java Banzai!");

        Integer soma1 = bacon.somar(10, 6);
        Integer soma2 = bacon.somar(soma1, 9);

        bacon.exibiMensagem(soma2.toString());

        Double media = bacon.calcularMedia(9.1, 8.5, 7.4);

        bacon.exibiMensagem(String.format("%.2f", media));

        Double mediaMaior = bacon.calcularMedia(6.5, 9.5, 7.8, 6.7);

        bacon.exibiMensagem(String.format("%.2f", mediaMaior));
    }
}