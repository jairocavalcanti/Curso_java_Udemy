package Sessão10.Exercicio_Proposto.Pratico2;

public class Employee {
    
    private Integer id;
    private String name;
    private Double salary;
   
    public Employee(){
    }
   
   
    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Double getSalary() {
        return salary;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increasesalary(double percentage){
       salary = salary + (salary * percentage/100);
       //salary += salary * percentage/100;
    }


    @Override
    public String toString() {
        return "Funcionario2 [id=" + id + ", name=" + name + ", salary=" + String.format("%.2f", salary) + "]";
    }
    
    


}
