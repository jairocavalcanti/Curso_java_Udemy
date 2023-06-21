package Sessão10.Exercicio_Proposto.Pratico2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in); 

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered?");
        int N = scanner.nextInt();
   
        for(int i = 0; i<N; i++){
           
            System.out.println();
            System.out.println("Employee #" + (i + 1) + " :");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase :");
        int idsalary = scanner.nextInt();
        Integer pos = position(list,idsalary);
        
        if(pos == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            list.get(pos).increasesalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee fun : list){
            System.out.println(fun);
        }

        scanner.close();
    
    }

    //funçao para procurar a posição do valor 'id' na lista
    //'list' nesse metodo não tem realaçao com o list de cima pois o mesmo está fora do MAIN
    public static Integer position(List<Employee> list, int id){
         for(int i = 0; i< list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
         }
         return null;

        }  


}
