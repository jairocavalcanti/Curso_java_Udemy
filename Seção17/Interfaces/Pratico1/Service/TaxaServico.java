package Seção17.Interfaces.Pratico1.Service;

// Esta classe é um bom exemplo de Principio_Aberto_Fechado ou Open_Closed_Principle(OCP)
// Definição: Uma entidade de software está fechada para alterações porém aberta para extensões

// A interface nos permite criar um  metodo padrão que será implementado com as regras de determinada classe do programa
// Dessa maneira podemos adaptar o metodo abaixo para diversificadas regras se assim for necessário
public interface TaxaServico {
    
    double taxa(double quantia);

}
