package org.exemplos.poo.caneta;

import java.util.Scanner;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 04/10/2023
 * @details Exemplo da criação de classes e objetos.
 * @note Exemplo 1 de introdução a POO / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class PrincipalCaneta
{
    public static void main(String[] args)
    {
        /*// < Declaração de variáveis locais >
        int erro;
        
        // < Cria um novo objeto caneta >
        Caneta caneta = new Caneta();
        
        // < Cria o objeto scanner >
        Scanner s = new Scanner(System.in);
        
        // < Entrada de dados >
        System.out.println("Modelo da caneta: ");
        caneta.modelo = s.next();
        
        System.out.println("Cor da caneta: ");
        caneta.cor = s.next();
        
        System.out.println("Ponta da caneta: ");
        caneta.ponta = s.nextFloat();
        
        System.out.println("Carga da caneta (%): ");
        caneta.carga = s.nextInt();
        
        // < "Tampa" a caneta >
        caneta.tampada = true;
        
        // < Verifica se está tampada >
        erro = caneta.tampar();
        
        // < Trata o valor recebido >
        if (erro > 0)
        {
            System.out.println("\nA caneta já está tampada.\n");
        }
        
       // < Verifica se está destampada >
       erro = caneta.destampar();
       
       // < Trata o valor recebido >
       if (erro > 0)
       {
           System.out.println("\nA caneta já está destampada.\n");
       }
       
       // < Chama o método de escrever >
        System.out.println(caneta.escrever());*/
        
        new frmCaneta().setVisible(true);
    }
}