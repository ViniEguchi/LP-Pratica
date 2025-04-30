package school.sptech;

public class Gato extends Pet {
    private Integer qtdVidas;

    public Gato(String nome, String raca, Double peso) {
        super(nome, raca, peso);
        this.qtdVidas = 7;
    }

    @Override
    public void comer() {
        System.out.println("Miau Miau");
    }

    public Integer getQtdVidas() {
        return qtdVidas;
    }

    public void setQtdVidas(Integer qtdVidas) {
        this.qtdVidas = qtdVidas;
    }
}
