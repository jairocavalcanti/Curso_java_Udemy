package Seção13.Enumerações.Pratico2;

public class Console {
    
    private String nome;
    private String jogo;
    private Status_Videogame status;
   


    public Console(){

    }


    public Console(String nome, String jogo, Status_Videogame status) {
        this.nome = nome;
        this.jogo = jogo;
        this.status = status;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public Status_Videogame getStatus() {
        return status;
    }

    public void setStatus(Status_Videogame status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "Console [ Nome = " + nome + ", Jogo = " + jogo + ", Status = " + status + " ]";
    }
       
}
