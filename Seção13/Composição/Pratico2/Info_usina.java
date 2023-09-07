package Seção13.Composição.Pratico2;

public class Info_usina {
    
    private String nome_usina;
    
    private Status_Usina stats;
    private Localizacao localizacao;

    public Info_usina(String nome_usina, Status_Usina stats, Localizacao Localizaçao) {
        this.nome_usina = nome_usina;
        this.stats = stats;
        this.localizacao = Localizaçao;
    }


    public String getNome_usina() {
        return nome_usina;
    }


    public void setNome_usina(String nome_usina) {
        this.nome_usina = nome_usina;
    }


    public Status_Usina getStats() {
        return stats;
    }


    public void setStats(Status_Usina stats) {
        this.stats = stats;
    }


    public Localizacao getlLocalizacao() {
        return localizacao;
    }


    public void setLocalizacao(Localizacao local) {
        this.localizacao = local;
    }

    
}
