package org.exercicios.poo.apolice;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 28/09/2023
 * @details Desenvolver uma classe Java chamada Apolice com os seguintes atributos:
 * nomeSegurado, idade e valorPremio. A classe Apolice deverá conter os 
 * seguintes métodos: imprimir(), calcularPremioApolice() e oferecerDesconto().
 * @note Exercício 1 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class Apolice 
{
    // < Declaração de atributos >
    public String nome_segurado;
    public int idade;
    public float valor_premio;
    
    // < Método para impressão dos atributos da classe Apolice >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Não retorna valor;
     * 2. deve mostrar na tela todos os atributos de Apolice.
     */
    public void imprimir()
    {
        System.out.println("Nome: " + this.nome_segurado + "\n"
                        + "Idade: " + this.idade + "\n"
                        + "Valor do prêmio: R$" + this.valor_premio + "\n");
    }
    
    // < Método para cálculo do prêmio >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Não retorna valor;
     * 2. idade > 18 e <= 25, use a fórmula: valor_premio += (valor_premio * 20) / 100;
     * 2. idade > 25 e <= 36: valor_premio += (valor_premio * 15) / 100;
     * 3. idade > 36: valor_premio += (valor_premio * 10) / 100.
     */
    public void calcularPremioApolice ()
    {
        // < Validações e cálculos >
        if (this.idade > 18 && this.idade <= 25)
        {
            this.valor_premio += (this.valor_premio * 20) / 100;
        }
        else if (this.idade > 25 && this.idade <= 36)
        {
            this.valor_premio += (this.valor_premio * 15) / 100;
        }
        else if (this.idade > 36)
        {
            this.valor_premio += (this.valor_premio * 10) / 100;
        }
    }
    
    // < Método para cálculo do desconto >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Não retorna valor;
     * 2. recebe como parâmetro cidade, que possui o nome da cidade para o cálculo do desconto;
     * 3. Curitiba recebe 20% de desconto;
     * 4. Rio de Janeiro recebe 15%;
     * 5. São Paulo, 10%;
     * 6. Belo Horizonte, 5%.
     */
    public void ofrecerDesconto (String cidade)
    {
        // < Declaração de variável local >
        String upper_cidade;
        
        // < Transforma a string em UPPER CASE >
        upper_cidade = cidade.toUpperCase();
        
        if (upper_cidade.equals("CURITIBA") == true)
        {
            valor_premio -= (valor_premio * 0.2);
        }
        else if (upper_cidade.equals("RIO DE JANEIRO") == true)
        {
            valor_premio -= (valor_premio * 0.15);
        }
        else if (upper_cidade.equals("SÃO PAULO") == true)
        {
            valor_premio -= (valor_premio * 0.1);
        }
        else if (upper_cidade.equals("BELO HORIZONTE") == true)
        {
            valor_premio -= (valor_premio * 0.05);
        }
        else
        {
            System.out.println("[!] Cidade inválida!\n> Tente: [\"Curitiba\", \"Rio de Janeiro\", \"São Paulo\", \"Belo Horizonte\"]\n");
        }
    }
}
