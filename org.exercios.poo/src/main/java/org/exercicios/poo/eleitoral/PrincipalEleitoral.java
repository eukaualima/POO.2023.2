package org.exercicios.poo.eleitoral;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 29/09/2023
 * @details Desenvolver uma segunda classe Java chamada PrincipalEleitoral, com o atributo valor.
 * @note Exercício 10 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class PrincipalEleitoral 
{
    // < Atributos da classe >
    public int valor;
    
    public static void main(String[] args) 
    {
        // < Cria o novo objeto eleitoral >
        Eleitoral eleitoral = new Eleitoral();
        
        // < Atribui valores a eleitoral >
        eleitoral.nome = "Seu zé";
        eleitoral.idade = 76;
        
        // < Faz a impressão dos valores na tela >
        eleitoral.imprimir();
    }
}
