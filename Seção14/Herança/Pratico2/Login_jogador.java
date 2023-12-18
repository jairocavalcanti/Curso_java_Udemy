package Seção14.Herança.Pratico2;


import java.util.ArrayList;

public class Login_jogador {
    
    private String login;
    private String senha;
    private Integer id;

   public static ArrayList<Login_jogador> array = new ArrayList<>();

    public Login_jogador(){

    }

    public Login_jogador(String login, String senha, Integer id) {
        this.login = login;
        this.senha = senha;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void adicionarlogin(Login_jogador log){
        array.add(log);
    }


    public static void visualizarlogins(){
        int cont = 0;     
        for (Login_jogador e: array){
            cont += 1;  
            System.out.println(
            "#" + cont + "\n" +
            "-------------------------------------------" + "\n" +
            " |--| ID do usuário: " + "#" + e.id + "\n" +
            " || Login do usuário: " + e.login + "\n" +
            " || Senha do usuário: " + e.senha + "\n" + 
            "-------------------------------------------"
           
            );
       }

    }  

}
