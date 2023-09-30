package org.exercicios.poo.acampamento;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 29/09/2023
 * @details Desenvolver uma classe Java chamada Acampamento com os seguintes atributos:
 * nome, equipe e idade. A classe Acampamento deverá conter os 
 * seguintes métodos: imprimir() e separarGrupo().
 * @note Exercício 3 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class Acampamento 
{
    // < Atributos da classe >
    public String nome;
    public String equipe;
    public int idade;
    
    // < Método para impressão dos atributos >
    public void imprimir ()
    {
        System.out.println("Nome: " + this.nome + "\n"
                        + "Idade: " + this.idade + "\n"
                        + "Equipe: " + this.equipe + "\n");
    }
    
    // < Método para separar os grupos por idade >
    /**
     * -> Regras dadas pelo exercício:
     * 1. Não retorna valor;
     * 2. se a idade estiver entre 6 e 10 anos, atribuir A ao atributo equipe;
     * 3. idade entre 11 e 20, atribuir B ao atributo equipe;
     * 4. idade maior que 21, atribuir C.
     */
    public void separarGrupo ()
    {
        // < Validações de idade >
        if (this.idade >= 6 && idade <= 10)
        {
            this.equipe = "A";
        }
        else if (this.idade >= 11 && idade <= 20)
        {
            this.equipe = "B";
        }
        else if (this.idade > 20)
        {
            this.equipe = "C";
        }
    }
}
