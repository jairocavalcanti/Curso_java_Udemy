package Sessão10.Exercicio_Proposto.Pratico1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Funcionario fun = new Funcionario();
            Double porcentagem = 0.0;
            String id;

            ArrayList<Funcionario> func = new ArrayList<>();

            System.out.println("Quantos empregados serão registrados?");
            int quant = scanner.nextInt();

            for(int i = 0; i<quant; i++){
            
                System.out.println();

                System.out.println("Funcionário --- " + i);
             
                System.out.println("Insira o ID do funcionário:");
                fun.id = scanner.next();
               
                System.out.println("Insira o nome do funcionario:");
                fun.nome = scanner.next();

                System.out.println("Insira o salário do funcionário:");
                fun.salario = scanner.nextDouble();

                func.add(new Funcionario(fun.id, fun.nome, fun.salario));
            }
            
            System.out.println("------- Funcionarios adicionados -------");

            for(Funcionario f : func){
                System.out.println(" -- id: " + f.id + " -- Nome: " + f.nome + " -- Salario: " + f.salario);
            }

      System.out.println();

      System.out.println("--- ID dos respectivos funcionários ---");
     
      //apenas o objeto 'f' criado precisa ser mencionado para que as informações sejam impressas
      //pois o metodo toString() ja existe na classe 'Funcionario'
      for(Funcionario f : func){
        System.out.println(f);
    }

            System.out.println("Insira o ID do funcionário que terá aumento salarial:");
            id = scanner.next();
      
            for(Funcionario f : func){
                if(id.equals(f.id)){
                    System.out.println("Funcionario identificado: -- " + f.nome);
                    
                    System.out.println("Insira a porcentagem de aumento salarial:");
                    porcentagem = scanner.nextDouble();
              
                    fun.aumento(porcentagem);
               
                    System.out.println("Salario atual do funcionário:" + f.salario);
                    System.out.println("Porcentagem do aumento:" + porcentagem + "%");
                    
                    System.out.println();

                    System.out.println("Aumento do funcionário:" + fun.aumento(porcentagem));
                    System.out.println("Aumento do funcionário com salario:" + (fun.aumento(porcentagem) + f.salario));
                    }else{
                        System.out.println("ID para funcionario: " + f.nome + " -- invalido" );
                    }
                }  
                    
              
            scanner.close();
        }
    }



}
