package Sessão9.Exercicio_de_fixação.Pratico2;

public class Account {
    
    private int number;
    private String holder;
    private Double balance;
   
   
    public Account(int number, String holder, Double initialdeposit) {
        this.number = number;
        this.holder = holder; 
        this.balance = initialdeposit;
    }


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }


    //Numero da conta nao pode ser alterado
    //por isso manter apenas o 'get'
    public int getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }


    public void setHolder(String holder) {
        this.holder = holder;
    }

    //saldo da conta so pode ser alterado por operaçoes de saque e depósito
    //por isso manter apenas o 'get'
    public Double getBalance() {
        return balance;
    }
 

    public void deposit(double amount){
        balance += amount;
    }


    public void withdraw(double amount){
         balance -= amount + 5.0;
    }


    @Override
    public String toString() {
        return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
    }


    



}
