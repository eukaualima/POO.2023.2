package org.exercicios.poo.apolice;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 28/09/2023
 * @details Desenvolver uma segunda classe Java chamada PrincipalApolice.
 * @note Exercício 2 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class PrincipalApolice 
{
    public static void main (String [] args)
    {
        // < Cria um novo objeto >
        Apolice novo_obj = new Apolice();
        
        // < Atribui valores ao segurado >
        novo_obj.nome_segurado = "Louro José";
        novo_obj.idade = 18;
        novo_obj.valor_premio = Float.parseFloat("23400.99");
        
        // < Imprime os atributos do novo objeto >
        novo_obj.imprimir();
        
        // < Calcula o valor do prêmio baseado na idade >
        novo_obj.calcularPremioApolice();
        
        // < Calcula o desconto baseado na cidade >
        novo_obj.ofrecerDesconto("Curitiba");
        
        // < Imprime os atributos novamente >
        novo_obj.imprimir();
    }
}
