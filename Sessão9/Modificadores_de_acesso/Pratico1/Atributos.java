package Sessão9.Modificadores_de_acesso.Pratico1;

import java.util.Date;

public class Atributos {

  private Date data;
  private Principal principal;

  public Atributos(Date data, Principal principal) {
    this.data = data;
    this.principal = principal;
    //atributo "nome" da classe principal nao possui modificadores de acesso e por isso pode ser acessado por classes do mesmo pacote
    this.principal.nome = "jairo";

}

public Date getData() {
    return data;
}

public void setData(Date data) {
    this.data = data;
}

public Principal getPrincipal() {
    return principal;
}

public void setPrincipal(Principal principal) {
    this.principal = principal;
}


  


}
