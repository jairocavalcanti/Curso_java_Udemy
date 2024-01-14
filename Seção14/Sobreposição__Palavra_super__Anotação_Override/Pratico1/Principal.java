package Seção14.Sobreposição__Palavra_super__Anotação_Override.Pratico1;

public class Principal {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1001, "Alex", 1000.0);
        conta.saque(200.0);
        System.out.println(conta.getSaldo());

        //sobreposição está funcionando

        //UPcasting
        Conta conta_2 = new Conta_poupanca(1002, "Maria", 1000.0, 0.01);
        conta_2.saque(200.0);
        System.out.println(conta_2.getSaldo());
    
    } 
}
