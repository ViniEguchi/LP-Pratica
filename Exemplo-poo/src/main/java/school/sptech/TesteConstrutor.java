package school.sptech;

public class TesteConstrutor {

    public static void main(String[] args) {
//        BilheteUnico bilheteUnico1 = new BilheteUnico("Manoel", 2025, "Black", 0.0, false, false);
//        bilheteUnico1.exibirInformacoes();
//        bilheteUnico1.efetuarRecarga(10.0);
//
//        BilheteUnico bilheteUnico2 = new BilheteUnico("Murilo", 2025);
//        bilheteUnico2.exibirInformacoes();
//        bilheteUnico1.efetuarRecarga(10.0);
//
//        // Não posso criar um bilhete único vazio
//        //        BilheteUnico bilheteUnico3 = new BilheteUnico();
//
//        BilheteUnico bilheteUnico3 = new BilheteUnico(2014);
//        bilheteUnico3.exibirInformacoes();

        BilheteUnico b1 = new BilheteUnico("Manoel", 2025);
        b1.efetuarRecarga(50.0);
        b1.efetuarRecarga(10000.0);
        b1.setNomeUsuario("Murilo");

        b1.exibirInformacoes();
    }
}
