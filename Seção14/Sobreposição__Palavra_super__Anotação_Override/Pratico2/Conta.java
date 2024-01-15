package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico2;


public class Conta {

    protected Long id;
    private String login;
    private String senha;
    protected Long pontos;
    

    public Conta(){

    }

    public Conta(Long id, String login, String senha, Long pontos) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.pontos = pontos;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Long getPontos() {
        return pontos;
    }


    public void setPontos(Long pontos) {
        this.pontos = pontos;
    }


    public void mostrarInformacoes(){
        StringBuilder sb = new StringBuilder();

        sb.append("ID: ").append(id).append("\n");
        sb.append("Login: ").append(login).append("\n");
        sb.append("Senha: ").append(senha).append("\n");
        sb.append("Pontos: ").append(pontos).append("\n");
      
        System.out.println(sb.toString());
 
    }


    
}
