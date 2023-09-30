package org.exercicios.poo.acampamento;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 29/09/2023
 * @details Desenvolver uma segunda classe Java chamada PrincipalAcampamento.
 * @note Exercício 4 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class PrincipalAcampamento 
{
    public static void main(String[] args) 
    {
        // < Cria o novo objeto Acampamento >
        Acampamento acampamento = new Acampamento();
        
        // < Atribui valores padrões aos atributos >
        acampamento.nome = "Joãozinho Passa Fome";
        acampamento.idade = 8;
        
        // < Imprime os atributos do novo objeto criado >
        acampamento.imprimir();
        
        // < Separa os membros por grupos de idade >
        acampamento.separarGrupo();
        
        // < Imprime novamente para avaliar o resultado >
        acampamento.imprimir();
    }
}
