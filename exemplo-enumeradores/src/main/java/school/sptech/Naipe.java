package school.sptech;

public enum Naipe {
    OUROS("Vermelho", 1),
    ESPADAS("Preto", 2),
    COPAS("Vermelho", 3),
    PAUS("Preto", 4);

    private final String cor;
    private final Integer valor;

    Naipe(String cor, Integer valor) {
        this.cor = cor;
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public Integer getValor() {
        return valor;
    }
}
