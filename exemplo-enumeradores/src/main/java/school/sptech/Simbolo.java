package school.sptech;

public enum Simbolo {
    A(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10),
    J(11),
    Q(12),
    K(13);

    private final Integer valor;

    Simbolo(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public static Simbolo fromInteger(Integer valor) {
        for (Simbolo simboloDaVez : Simbolo.values()) {
            if (simboloDaVez.getValor().equals(valor)) {
                return simboloDaVez;
            }
        }

        return null;
    }
}
