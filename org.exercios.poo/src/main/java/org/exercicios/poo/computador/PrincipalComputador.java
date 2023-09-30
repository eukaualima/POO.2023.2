package org.exercicios.poo.computador;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 28/09/2023
 * @details Desenvolver uma segunda classe Java chamada PrincipalComputador.
 * @note Exercício 6 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class PrincipalComputador 
{
    public static void main(String[] args) 
    {
        // < Declaração de variáveis locais >
        int retorno;
        
        // < Cria o objeto computador >
        Computador computador = new Computador();

        // < Atribui valores ao computador >
        computador.marca = "HP";
        computador.modelo = "Compact";
        computador.cor = "Amarelo";
        computador.numero_serie = 123456.0f;
        computador.preco = 15000.0f;
        
        // < Faz a impressão dos atributos >
        computador.imprimir();
        
        // < Faz o cálculo do valor referente à marca >
        computador.calcularValor();
        
        // < Faz a impressão do novo valor e os demais atributos >
        computador.imprimir();
        
        // < Cria um segundo objeto computador >
        Computador computador_1 = new Computador();
        
        // < Atribui valores ao computador_1 >
        computador_1.marca = "IBM";
        computador_1.modelo = "Basic";
        computador_1.cor = "Preto";
        computador_1.numero_serie = 7891011.0f;
        computador_1.preco = 15000f;
        
        // < Faz a impressão dos atributos >
        computador_1.imprimir();
        
        // < Faz o cálculo do valor referente à marca >
        computador_1.calcularValor();
        
        // < Faz a impressão do novo valor e os demais atributos >
        computador_1.imprimir();
        
        // < Altera e valida a mudança de preço >
        if (computador_1.alteraValor(15799.99f) == 1)
        {
            System.out.println("Valor alterado.\n");
        }
        else
        {
            System.out.println("Valor NÃO alterado.\n");
        }
        
        // < Imprime novamente o valor e os demais atributos >
        computador_1.imprimir();
    }
}
