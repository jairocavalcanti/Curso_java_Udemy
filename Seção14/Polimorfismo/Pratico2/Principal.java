package Seção14.Polimorfismo.Pratico2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        System.out.println("Insira o numero de funcionários: ");
        int N = scanner.nextInt();
    
        for(int i = 0; i < N; i++ ){
         
            System.out.println("Dados do funcionário #" + (i + 1) + " :" );
            System.out.printf("Terceirizado - (S/N) ?");
            char ch = scanner.next().charAt(0);
            System.out.printf("Nome: ");
            String nome = scanner.next();
            System.out.printf("Horas: ");
            int horas = scanner.nextInt();
            System.out.printf("Valor por horas: ");
            double valor_por_hora = scanner.nextDouble();
           
            if(ch == 's'){
                System.out.printf("Adicional: ");
                double adicional = scanner.nextDouble();
                Funcionario func = new Funcionario_terceirizado(nome, horas, valor_por_hora, adicional);
                lista.add(func);
                // -- Maneira alternativa de adicionar na lista:
                //    - lista.add(new Funcionario_terceirizado(nome, horas, valor_por_hora, adicional));
            }else{
                Funcionario func_1 = new Funcionario(nome, horas, valor_por_hora);
                lista.add(func_1);
            }
        }

        System.out.println();
        System.out.println("PAGAMENTOS: ");

        int cont = 1;
        for (Funcionario f : lista) {
             System.out.println("--" + cont++ + "#");
             System.out.println("Nome: " + f.getNome());
             System.out.println("Pagamento: " + f.pagamento());
             System.out.println("-------------------------------------");
            }
        
        scanner.close();
    }
    
}
