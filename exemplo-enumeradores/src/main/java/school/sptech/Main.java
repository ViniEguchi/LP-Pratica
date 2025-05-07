package school.sptech;

public class Main {

    public static void main(String[] args) {
        Carta c1 = new Carta(Simbolo.J, Naipe.COPAS);
        Carta c2 = new Carta(Simbolo.TRES, Naipe.PAUS);
        Carta c3 = new Carta(Simbolo.SETE, Naipe.ESPADAS);
        Carta c4 = new Carta(Simbolo.OITO, Naipe.OUROS);

        if (c1.getNaipe().compareTo(c2.getNaipe()) > 0) {
            System.out.println("Carta 1 ganhou");
        } else if (c1.getNaipe().compareTo(c2.getNaipe()) == 0) {
            System.out.println("Empate");
        } else {
            System.out.println("Carta 2 ganhou");
        }

        System.out.println(c1.getNaipe().getCor());

        switch (c1.getNaipe()) {
            case OUROS -> System.out.println("Esta carta é do naipe ouros");
            case ESPADAS -> System.out.println("Esta carta é do naipe espadas");
            case PAUS -> System.out.println("Esta carta é do naipe paus");
            case COPAS -> System.out.println("Esta carta é do naipe copas");
        }

        System.out.println("Exibindo todos os simbolos");
        for (Simbolo simbolo : Simbolo.values()) {
            System.out.println(simbolo);
        }
    }
}