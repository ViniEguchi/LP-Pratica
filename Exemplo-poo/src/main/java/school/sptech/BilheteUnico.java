package school.sptech;

public class BilheteUnico {

    String nomeUsuario;
    Integer anoEmissao;
    String cor;
    Double saldo;
    Boolean estudante;
    Boolean idoso;

    Boolean efetuarRecarga(Double valor) {

        if (valor < 2 || valor > 100) {
            System.out.println("Valor inválido! Recarga não efetuada");
            return false;
        }

        saldo += valor;
        System.out.println("Recarga efetuada com sucesso!");
        return true;
    }

    void pagarPassagem(boolean integracao) {

        if (integracao) {
            System.out.println("Valor da passagem R$ 0,00");
            return;
        }

        Double valorPassagem = estudante ? 2.60 : 5.20;

        if (saldo >= valorPassagem) {
            saldo -= valorPassagem;
            System.out.printf("Valor da passagem R$ %.2f\n", valorPassagem);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void exibirInformacoe() {

        System.out.printf("""
                ----------------
                Nome usuário: %s
                ----------------
                Ano: %d
                Cor: %s
                Saldo: %.2f
                Estudante: %b
                Idoso: %b
                \n""", nomeUsuario, anoEmissao, cor, saldo, estudante, idoso);
    }
}
