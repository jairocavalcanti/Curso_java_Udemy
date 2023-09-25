package Seção13.DemoStringBuilder.Pratico1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    //"private static" serve para que não tenha uma cópia do objeto "sdf" para cada Post da aplicação
    //Irá existir apenas uma cópia para a aplicação inteira
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comments = new ArrayList<>();


    public Post(){

    }

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }


    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComments() {
        return comments;
    }

    //Metodos padrao para coleções

    //Nao se usa o metodo SET, se fazem metodos como abaixo :

    public void addComentario(Comentario comment){
        comments.add(comment);
    }

    public void removeComentario(Comentario comment){
        comments.remove(comment);
    }

    //Concatenações padrão "+" vão consumir muita memoria nesse caso e deixará o programa lento
    // "append" = acrescentar no final
    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(titulo + "\n");
       sb.append(likes);
       sb.append(" Likes - ");
       sb.append(sdf.format(momento)).append("\n");
       sb.append(conteudo + "\n");
       sb.append(" // Comentarios // \n");
       //Acrescentando todos os comentarios no String Builder
       int numero_comentario = 0;
       for(Comentario c: comments){
        numero_comentario++;
        sb.append("#" + numero_comentario).append(" -- ").append(c.getTexto()).append("\n"); 
        }
       //Convertendo o String Builder para String
       return sb.toString();
    }
    
}
