package org.exercicios.poo.estoque;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 30/09/2023
 * @details Desenvolver uma segunda classe Java chamada PrincipalEstoque.
 * @note Exercício 12 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class PrincipalEstoque 
{
    public static void main(String[] args) {
        // < Cria o novo objeto estoque >
        Estoque estoque = new Estoque();
        Estoque estoque_1 = new Estoque();
        Estoque estoque_2 = new Estoque();

        // < Atribuição de valores aos atributos >
        estoque.nome_produto = "Café";
        estoque.valor = 6.99f;
        estoque.quantidade = 10;
        
        estoque_1.nome_produto = "Lasanha";
        estoque_1.valor = 12.99f;
        estoque_1.quantidade = 0;
        
        estoque_2.nome_produto = "Feijão";
        estoque_2.valor = 6.78f;
        estoque_2.quantidade = 120;
        
        // < Faz a impressão dos valores >
        estoque.imprimir();

        estoque_1.imprimir();

        estoque_2.imprimir();
        
        // < Faz a remoção de produtos >
        System.out.println("PRODUTO 1 (REMOÇÃO):\n");
        
        if (estoque.removerProdutos(3) == 1)
        {
            System.out.println("Remoção feita com sucesso!");
        }
        else
        {
            System.out.println("Remoção não realizada.");
        }
        
        System.out.println("\n\nPRODUTO 2 (REMOÇÃO):\n");
        
        if (estoque_1.removerProdutos(5) == 1)
        {
            System.out.println("Remoção feita com sucesso!");
        }
        else
        {
            System.out.println("Remoção não realizada.");
        }
        
        System.out.println("\n\nPRODUTO 3 (REMOÇÃO):\n");
        
        if (estoque_2.removerProdutos(100) == 1)
        {
            System.out.println("Remoção feita com sucesso!");
        }
        else
        {
            System.out.println("Remoção não realizada.");
        }
        
        // < Faz a impressão após a remoção >
        estoque.imprimir();
        
        estoque_1.imprimir();
        
        estoque_2.imprimir();
        
    }
}
