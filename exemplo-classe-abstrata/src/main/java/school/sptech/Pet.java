package school.sptech;

public abstract class Pet {
    private String nome;
    private String raca;
    private Double peso;

    public Pet(String nome, String raca, Double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public abstract void comer();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                '}';
    }
}
