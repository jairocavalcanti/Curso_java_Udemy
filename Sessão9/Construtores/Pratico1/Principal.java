package Sessão9.Construtores.Pratico1;

import java.util.Locale;
import java.util.Scanner;

public class Principal{
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);


System.out.println("Enter product data: ");
System.out.print("Name: ");
String name = sc.nextLine();
System.out.print("Price: ");
double price = sc.nextDouble();
System.out.print("Quantity in stock: ");
int quantity = sc.nextInt();

//construtor depois da inserção de dados evita que dados vazios sejam printados
//VERY USEFUL
Produto product = new Produto(name, price, quantity);


System.out.println();
System.out.println("Product data: " + product);

System.out.println();
System.out.print("Enter the number of products to be added in stock: ");
quantity = sc.nextInt();
product.addProducts(quantity);

System.out.println();
System.out.println("Updated data: " + product);

System.out.println();
System.out.print("Enter the number of products to be removed from stock: ");
quantity = sc.nextInt();
product.removeProducts(quantity);

System.out.println();
System.out.println("Updated data: " + product);

sc.close();
    }
 }