package Seção13.DemoStringBuilder.Pratico2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Relatorios {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String problema;
    private String detalhes_problema;

    private List<Observacoes> lista = new ArrayList<>();

    public Relatorios(){

    }

    public Relatorios(Date momento, String problema, String detalhes_problema) {
        this.momento = momento;
        this.problema = problema;
        this.detalhes_problema = detalhes_problema;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDetalhes_problema() {
        return detalhes_problema;
    }

    public void setDetalhes_problema(String detalhes_problema) {
        this.detalhes_problema = detalhes_problema;
    }

    public List<Observacoes> getLista() {
        return lista;
    }

    public void addobservacao(Observacoes observacoes){
        lista.add(observacoes);
    }

    public void removeobservacao(Observacoes observacoes){
        lista.remove(observacoes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        System.out.println(" -- PROBLEMAS ENCONTRADOS --");
        sb.append("Problema 1: " + problema).append("!! \n");
        sb.append("Problema 2: " + detalhes_problema).append("!! \n");
        sb.append("\n");
        sb.append("Data do registro: ").append(sdf.format(momento) + "\n");
        sb.append("\n");
        sb.append("//OBSERVAÇOES// \n");
        int numero_obs = 1;
        for(Observacoes obv: lista){
            sb.append("#" + numero_obs++ + " -- ").append(obv.getTexto()).append("\n");
        }
        return sb.toString();
    }

}
