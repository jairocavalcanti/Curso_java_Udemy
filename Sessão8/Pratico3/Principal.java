package Sessão8.Pratico3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Aluno al = new Aluno();

    System.out.println("Insira a primeira nota do aluno:");
    al.nota1 = scanner.nextDouble();

    System.out.println("Insira a segunda nota do aluno:");
    al.nota2 = scanner.nextDouble();

    System.out.println("Insira a terceira nota do aluno:");
    al.nota3 = scanner.nextDouble();

    System.out.println("Nota final do aluno:" + al.notafinal());
 
    al.analise();
    
    scanner.close();

    }
}
