package Seção15.Excecoes_personalizadas.Pratico3_solucao_boa;

// Classe 'DomainException' herda todas as propriedades e métodos da classe 'RuntimeException'
public class DomainException extends RuntimeException {
   
/*
  serialVersionUID é usado durante a serialização para verificar se o remetente e o receptor de um objeto serializado têm classes compatíveis. 
  Se uma classe serializável não declarar explicitamente um serialVersionUID, um será gerado automaticamente, 
  mas isso pode levar a incompatibilidades se a classe for modificada
*/
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
      /*
        super(msg): Chama o construtor da superclasse (RuntimeException) com a mensagem de erro msg. 
        Isso permite que a mensagem de erro seja armazenada e recuperada usando os métodos da classe RuntimeException.
      */
        super(msg);
    }


}
