package school.sptech;

public class Cachorro extends Pet {
    private boolean lateMuito;

    public Cachorro(String nome, String raca, Double peso, boolean lateMuito) {
        super(nome, raca, peso);
        this.lateMuito = lateMuito;
    }

    @Override
    public void comer() {
        System.out.println("Au Au");
    }

    public boolean isLateMuito() {
        return lateMuito;
    }

    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }
}
