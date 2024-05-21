package Seção15.Excecoes_personalizadas.Pratico3_solucao_boa;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }


}
