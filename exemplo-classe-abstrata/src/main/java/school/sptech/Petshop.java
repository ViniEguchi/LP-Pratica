package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Petshop {
    private String nome;
    private List<Pet> pets;

    public Petshop(String nome) {
        this.nome = nome;
        this.pets = new ArrayList<>();
    }

    public void receberPet(Pet pet) {
        this.pets.add(pet);
    }

    public void alimentar() {
        for (Pet pet : pets) {
            pet.comer();
        }
    }

    public List<Gato> retornarGatos() {
        List<Gato> gatos = new ArrayList<>();

        for (Pet pet : pets) {
            if (pet instanceof Gato gato) {
                gatos.add(gato);
            }
        }

        return gatos;
    }
}
