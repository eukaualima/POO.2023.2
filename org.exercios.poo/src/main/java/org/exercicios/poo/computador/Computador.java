package org.exercicios.poo.computador;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 29/09/2023
 * @details Desenvolver uma classe chamada Computador com os seguintes atributos:
 * marca, cor, modelo, numeroSerie, preco. Implementar os seguintes métodos:
 * imprimir(), calcularValor() e alterarValor().
 * @note Exercício 5 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class Computador 
{
    // < Atributos da classe >
    public String marca;
    public String cor;
    public String modelo;
    public float numero_serie;
    public float preco;
    
    // < Método para imprimir os atributos da classe >
    public void imprimir ()
    {
        System.out.println("Marca: " + this.marca + "\n"
                        + "Cor: " + this.cor + "\n"
                        + "Modelo: " + this.modelo + "\n"
                        + "Número de série: " + this.numero_serie + "\n"
                        + "Preço: " + this.preco + "\n");
    }
    
    // < Método para calcular o valor dos computadores >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Caso a marca seja HP, acrescentar 30% ao preço;
     * 2. caso seja IBM, acrescentar 50%;
     * 3. caso seja qualquer outra, manter o preço.
     */
    public void calcularValor ()
    {
        if (this.marca.equalsIgnoreCase("HP"))
        {
            this.preco += (this.preco * 0.3);
        }
        else if (this.marca.equalsIgnoreCase("IBM"))
        {
            this.preco += (this.preco * 0.5);
        }
    }
    
    // < Método para alterar o valor dos computadores >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Recebe um valor como parâmetro;
     * 2. atribui este valor ao atributo preco, caso seja maior que 0;
     * 3. caso seja maior que 0, deverá atribuir o novo preço e retornar 1.
     * 4. caso contrário, não atribui o valor e retorna 0.
     * @return 1 - Valor alterado / 0 - Valor NÃO alterado.
     * @param preco_param Recebe um preço para o produto.
     */
    public int alteraValor (float preco_param)
    {
        if (preco_param > 0)
        {
            this.preco = preco_param;
            
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
