package Seção15.Excecoes_personalizadas.Pratico_fixação;

public class DomainException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }

}
