package Sessão8.Pratico3;

public class Aluno {
   
    public boolean passou = true;
    public boolean reprovou = false;
    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public Double notafinal() {
      return nota1 + nota2 + nota3;
    }

    public void analise(){
     if(notafinal()<60){
      System.out.println("Aluno passou:" + reprovou);
      System.out.println("Pontos faltando:" + (60 - notafinal()));
    }else{
        System.out.println("Aluno passou:" + passou);
       }
       System.out.println("Results:" + notafinal());


        }
    }



