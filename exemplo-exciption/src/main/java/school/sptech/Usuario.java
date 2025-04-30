package school.sptech;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        if (email == null || email.isBlank()) {
            // Para lançar uma exceção usar a palavra-chave throw
            // unchecked exceptions são exceções que o compilador não nos obriga a tratar. Herdam de RunTimeException
            // ex: NullPointerException, IndexOutOfBoundsException, RunTimeException, etc.
//            throw new RuntimeException("O email não pode estar vazio!!!");
            throw new ValorUsuarioInvalidoException("Email errado");
        }

        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String email, String senha) throws Exception {
        // Checked excepcions são exceções que o compilador nos obriga a tratar :(
        // Herdam de Exception
        if (email == null || email.isBlank()) {
            throw new Exception();
        }

        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
