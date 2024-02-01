package Seção14.Polimorfismo.Pratico3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) throws ParseException {
      Scanner scanner = new Scanner(System.in);
      
      Produto pr = new Produto();
      Produto_importado pi = new Produto_importado();
      Produto_usado pu = new Produto_usado();

      System.out.println("Insira o numero de produtos: ");
      int quantidade = scanner.nextInt();

      for(int i = 0; i < quantidade; i++){
        System.out.println(" -- Dados do #" + i + " produto: ");
        System.out.printf("Comum, usado ou importado (c/u/i)? ");
        String tipo = scanner.next();
  
        if(tipo.equals("i")){
          System.out.printf("Nome: ");
          String nome_i = scanner.next();
           
          System.out.printf("Preço: ");
          Double preco_i = scanner.nextDouble();
          
          System.out.printf("Taxa alfandegaria: ");
          Double taxa_i = scanner.nextDouble(); 
            
          pi = new Produto_importado(nome_i, preco_i, taxa_i);
        } 
          
        if(tipo.equals("u")){
          System.out.printf("Nome: ");
          String nome_u = scanner.next();

          System.out.printf("Preço: ");
          Double preco_u = scanner.nextDouble();

          System.out.printf("Insira a data (DD/MM/YYYY): ");
          String data_str = scanner.next();

          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
          Date data = sdf.parse(data_str);

          pu = new Produto_usado(nome_u, preco_u, data);
        }
       
        if(tipo.equals("c")){
          System.out.printf("Nome: ");
          String nome_c = scanner.next();

          System.out.printf("Preço: ");
          Double preco_c = scanner.nextDouble();

          pr = new Produto(nome_c, preco_c);
        }
        

      }

      System.out.println("-- ETIQUETAS_DE_PREÇO --");
      if(pi.getNome() != null){
        System.out.println(pi.etiqueta_de_preco());
      }
       
      if(pu.getNome() != null){
        System.out.println(pu.etiqueta_de_preco());
      }

      if(pr.getNome() != null){
        System.out.println(pr.etiqueta_de_preco());
      }
    
      scanner.close();
  }

}
