package school.sptech;

public class Peixe extends Pet {
    private boolean aguaDoce;

    public Peixe(String nome, String raca, Double peso, boolean aguaDoce) {
        super(nome, raca, peso);
        this.aguaDoce = aguaDoce;
    }

    @Override
    public void comer() {
        System.out.println("Glub Glub");
    }

    public boolean isAguaDoce() {
        return aguaDoce;
    }

    public void setAguaDoce(boolean aguaDoce) {
        this.aguaDoce = aguaDoce;
    }
}
