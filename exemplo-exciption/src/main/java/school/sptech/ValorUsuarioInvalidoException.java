package school.sptech;

public class ValorUsuarioInvalidoException extends RuntimeException {

    public ValorUsuarioInvalidoException() {
        super("Erro padrão");
    }

    public ValorUsuarioInvalidoException(String message) {
        super(message);
    }
}
