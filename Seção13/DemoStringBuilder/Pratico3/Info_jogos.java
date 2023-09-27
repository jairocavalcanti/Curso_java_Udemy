package Seção13.DemoStringBuilder.Pratico3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Info_jogos {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private String titulo_do_jogo;
    private String sinopse;
    private Date data_de_lançamento;
    
    private List<Opinioes> info = new ArrayList<Opinioes>();

    public Info_jogos(){

    }


    public Info_jogos(String titulo_do_jogo, String sinopse, Date data_de_lançamento) {
        this.titulo_do_jogo = titulo_do_jogo;
        this.sinopse = sinopse;
        this.data_de_lançamento = data_de_lançamento;
    }


    public String getTitulo_do_jogo() {
        return titulo_do_jogo;
    }

    public void setTitulo_do_jogo(String titulo_do_jogo) {
        this.titulo_do_jogo = titulo_do_jogo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Date getData_de_lançamento() {
        return data_de_lançamento;
    }

    public void setData_de_lançamento(Date data_de_lançamento) {
        this.data_de_lançamento = data_de_lançamento;
    }


    public List<Opinioes> getInfo() {
        return info;
    }


    public void addopiniao(Opinioes comentario){
        info.add(comentario);
    }

    public void removeopiniao(Opinioes comentario){
        info.remove(comentario);
    }


    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      System.out.println("-- DETALHES DO JOGO --");
      sb.append("\n");
      sb.append("Titulo do game: " + titulo_do_jogo  + "\n" );
      sb.append("------------------------------------" +"\n") ;
      sb.append("Sinopse: " + 
      "\n" + sinopse + "\n");
      sb.append("------------------------------------" +"\n") ;
      sb.append("Data de lançamento do game: " + sdf.format(data_de_lançamento) + "\n");
      sb.append("------------------------------------" +"\n") ;
      sb.append("//COMENTARIOS// \n");
      int cont = 0;
      for(Opinioes op : info){
        sb.append("Comentario: " + cont++ + " -- ");
        sb.append(op.getComentario() + "\n");
     }
    return sb.toString();
    }

    


}
