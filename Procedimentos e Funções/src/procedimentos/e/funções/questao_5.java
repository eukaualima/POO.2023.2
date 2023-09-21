package procedimentos.e.funções;
/*
=-----------------=
=-> Importações <-=
=-----------------=
*/
import javax.swing.*;

/*
=---------------=
=-> Cabeçalho <-=
=---------------=
*/
/**
 * @author Kauã dos Santos Lima
 * @since 20/09/2023
 * @details Faça um procedimento que recebe a idade de um nadador por parâmetro 
 * e imprime a categoria desse nadador de acordo com a tabela abaixo: Chame 
 * atenção do usuário em caso de uma consulta inválida, ou seja, com números 
 * menores ou iguais a zero, ou menores do que a quantidade cadastrada.
 *   Idade		Categoria 
 *   5 a 7 anos 	Infantil A 
 *   8 a 10 anos 	Infantil B 
 *   11-13 anos 	Juvenil A 
 *   14-17 anos 	Juvenil B 
 *   Maiores de 	18 anos (inclusive) Adulto
 * @note Lista 1 de Procedimentos e Funções / Programação Orientada a Objetos 2023.2 - IFBA Campus Camaçari - Prof. Dr. Fábio Marques
 **/

/*
=----------------------=
=-> Classe Principal <-=
=----------------------=
*/
public class questao_5
{
    // < Função principal >
    public static void main(String[] args) {
        // < Declaração de variáveis locais >
        String cat;
        int idade;
        
        // < Coleta idade do nadador >
        idade = recebe_idade();
        
        // < Coleta categoria do nadador >
        cat = categoria(idade);
        
        // < Imprime o resultado >
        saida(cat, idade);
    }
    
    // < Subprogramas >
    // < Função para a entrada de dados >
    public static int recebe_idade()
    {
        // < Declaração de variáveis locais >
        String resposta;
        int idade;
        
        // < Entrada de dados >
        resposta = JOptionPane.showInputDialog(null, "Informe a idade:", "Categoria de Nadadores", 3);
        idade = Integer.parseInt(resposta);
        
        // < Verifica se a idade infomada é válida > 
        if (idade < 5 || idade > 80)
        {
            JOptionPane.showMessageDialog(null, "Idade inválida!\nInforme idades entre 5 e 80 anos.", "Categoria de Nadadores", 2);
            return recebe_idade();
        }
        
        // < Retorna a idade informada pelo usuário >
        return idade;
    }
    
    // < Função para informar a categoria do nadador >
    public static String categoria(int idade)
    {
        // < Declaração de variáveis locais >
        String resposta;
        
        // < Verifica a idade do nadador >
        if (idade >= 5 && idade <= 7)
        {
            resposta = "Infantil A";
        }
        else if (idade >= 8 && idade <= 10)
        {
            resposta = "Infantil B";
        }
        else if (idade >= 11 && idade <= 13)
        {
            resposta = "Juvenil A";
        }
        else if (idade >= 14 && idade <= 17)
        {
            resposta = "Juvenil A";
        }
        else
        {
            resposta = "Adulto";
        }
        
        // < Retorna ao usuário a categoria >
        return resposta;
    }
    
    // < Função para a impressão da categoria >
    public static void saida(String resultado, int idade)
    {
        JOptionPane.showMessageDialog(null, "Idade informada:\n" + idade + "\nCategoria:\n" + resultado, "Categoria de Nadadores", 1);
    }
}
