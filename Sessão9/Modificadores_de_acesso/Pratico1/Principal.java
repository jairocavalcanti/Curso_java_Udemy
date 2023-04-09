package Sessão9.Modificadores_de_acesso.Pratico1;

//PRIVATE: o membro so pode ser acessado na PROPRIA CLASSE
//(nada): o membro so pode ser acessado nas classes do MESMO PACOTE 
//PROTECTED: o membro so pode ser acessado no MESMO PACOTE, bem como em SUBCLASSES DE PACOTES DIFERENTES 
//PUBLIC: o membro é acessado por todas as classes (ao menos que ele resida em um modulo diferente que nao exporte o pacote onde ele esta)

public class Principal {
    
    //atributo sem modificadores de acesso, acessivel dentro de qualquer classe do mesmo PACOTE
    String nome;
 
    public static void main(String[] args) {
    Atributos at = new Atributos(null, null);

    System.out.println(at);
    //atributo privado nao vai ser visivel ao tentar acessa-lo
    //System.out.println(at.atributoprivado);
   
   }

}
