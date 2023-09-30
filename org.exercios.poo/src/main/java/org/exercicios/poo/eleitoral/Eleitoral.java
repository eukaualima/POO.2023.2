package org.exercicios.poo.eleitoral;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 29/09/2023
 * @details Desenvolver uma classe chamada Eleitoral com os seguintes atributos:
 * nome e idade. Implementar os seguintes métodos:
 * imprimir(), verificar().
 * @note Exercício 9 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class Eleitoral 
{
    // < Atributos da classe >
    public String nome;
    public int idade;
    
    // < Método para validação do eleitor >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Não retorna valor, nem recebe parâmetro;
     * 2. deve exibir na tela as seguintes condições:
     *      a. se a idade for inferior a 16 anos, exibir "Eleitor não pode votar";
     *      b. para idade superior ou igual a 16 anos e inferior ou igual a 65 anos, exibir na tela "Eleitor deve votar";
     *      c. para idade superior a 65 anos, exibir na tela "Voto facultativo".
     */
    public void verificar ()
    {
        if (this.idade < 16)
        {
            System.out.println("Eleitor não pode votar.");
        }
        else if (this.idade >= 16 && this.idade <= 65)
        {
            System.out.println("Eleitor deve votar.");
        }
        else if (this.idade > 65)
        {
            System.out.println("Voto facultativo.");
        }
    }
    
    // < Método para impressão dos atributos >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Não retorna valor, nem recebe parâmetro;
     * 2. deve executar o método verificar() como último comando.
     */
    public void imprimir ()
    {
        System.out.println("Nome do eleitor: " + this.nome + "\n"
                        + "Idade do eleitor: " + this.idade + "\n");
        
        this.verificar();
    }
}
