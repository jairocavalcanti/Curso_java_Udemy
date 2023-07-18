package Seção9.Construtores.Pratico1;

public class Produto{

    public String name;
    public double price;
    public int quantity;
   
    
    //Construtor
    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public double totalValueInStock() {
    return price * quantity;
    }

    public void addProducts(int quantity) {
    this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
    this.quantity -= quantity;
    }
  
    public String toString() {
    return name
    + ", $ "
    + String.format("%.2f", price)
    + ", "
    + quantity
    + " units, Total: $ "
    + String.format("%.2f", totalValueInStock());
    }
    

}



