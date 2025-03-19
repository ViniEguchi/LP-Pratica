package school.sptech;

public class BilheteUnico {

    private String nomeUsuario;
    private Integer anoEmissao;
    private String cor;
    private Double saldo;
    private Boolean meiaEntrada;
    private Boolean idoso;

    BilheteUnico(String nomeUsuario, Integer anoEmissao, String cor, Double saldo, Boolean meiaEntrada, Boolean idoso) {
        this.nomeUsuario = nomeUsuario;
        this.anoEmissao = anoEmissao;
        this.cor = cor;
        this.saldo = saldo;
        this.meiaEntrada = meiaEntrada;
        this.idoso = idoso;
    }

    BilheteUnico(String nomeUsuario, Integer anoEmissao) {
        this.nomeUsuario = nomeUsuario;
        this.anoEmissao = anoEmissao;
        this.saldo = 0.0;
    }

    BilheteUnico(Integer anoEmissao) {
        this("Usuario desconhecido", anoEmissao);
    }

    public BilheteUnico(Boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }

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

        Double valorPassagem = meiaEntrada ? 2.60 : 5.20;

        if (saldo >= valorPassagem) {
            saldo -= valorPassagem;
            System.out.printf("Valor da passagem R$ %.2f\n", valorPassagem);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void exibirInformacoes() {
        System.out.printf("""
                ----------------
                Nome usuário: %s
                ----------------
                Ano: %d
                Cor: %s
                Saldo: %.2f
                Estudante: %b
                Idoso: %b
                \n""", nomeUsuario, anoEmissao, cor, saldo, meiaEntrada, idoso);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNomeUsuario(String nomeUsuario) {
        if (!nomeUsuario.equals("")) {
            this.nomeUsuario = nomeUsuario;
        }
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Integer getAnoEmissao() {
        return anoEmissao;
    }

    public void setAnoEmissao(Integer anoEmissao) {
        this.anoEmissao = anoEmissao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getEstudante() {
        return meiaEntrada;
    }

    public void setEstudante(Boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }

    public Boolean getIdoso() {
        return idoso;
    }

    public void setIdoso(Boolean idoso) {
        this.idoso = idoso;
    }
}
