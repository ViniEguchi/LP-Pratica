package school.sptech;

public class Main {
    public static void main(String[] args) {
        // classes abstratas são apenas "ideias". Usamos ela de molde para criar outras classes. Não podemos ter um Pet, mas um gato ou cachorro
//        Pet pet01 = new Pet("Bob", "Cornelius", 200.0);
//        Pet pet02 = new Pet("Dipirona", "Calopisita", 20.0);

        Gato gato01 = new Gato("Tom", "razus", 5.0);
        Peixe peixe01 = new Peixe("Peixonauta", "Tilapia", 5.0, true);
        Gato gato02 = new Gato("Frajola", "frajola", 7.0);
        Cachorro cachorro02 = new Cachorro("Bidu", "golden", 40.0, false);

//        pet01.comer();
//        pet02.comer();
        gato01.comer();
        peixe01.comer();
        gato02.comer();
        cachorro02.comer();
    }
}